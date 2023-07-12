package ar.com.lokywolf2295.proyectocarritodecompras.service.impl;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShoppingRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShoppingItemRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ShopOrderResponseDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;
import ar.com.lokywolf2295.proyectocarritodecompras.model.mapper.OrderMapper;
import ar.com.lokywolf2295.proyectocarritodecompras.repository.ShopOrderRepository;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IShopOrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShopOrderServiceImpl implements IShopOrderService {

    private final ShopOrderRepository repository;
    private final ProductServiceImpl productService;
    private final ShoppingCartServiceImpl shoppingCartService;
    private final OrderMapper orderMapper;

    @Override
    public ShopOrderResponseDTO createShopOrder(ShoppingRequestDTO shoppingRequestDTO) {
        double totalAmount = 0;

        List<ShoppingCart> shoppingCartList = new ArrayList<>();
        for (ShoppingItemRequestDTO item : shoppingRequestDTO.getCart()) {
            Product productById = productService.getProductById(item.getId());
            productService.quantityVerification(productById, item.getQuantity());
            productService.updateQuantity(productById, item.getQuantity());

            double price = item.getQuantity() * productById.getPrice();
            ShoppingCart shoppingCart = shoppingCartService.createShoppingCart(productById, item.getQuantity(), BigDecimal.valueOf(price));
            totalAmount = totalAmount + price;
            shoppingCartList.add(shoppingCart);
        }
        ShopOrder shopOrder = buildShopOrder(shoppingCartList, BigDecimal.valueOf(totalAmount));
        shopOrder = repository.save(shopOrder);

        for (ShoppingCart cart : shoppingCartList) {
            shoppingCartService.appendOrder(cart, shopOrder);
        }
        return orderMapper.toDTO(shopOrder);
    }

    @Override
    public ShopOrderResponseDTO getShopOrderDetails(Long id) {
        Optional<ShopOrder> shopOrder = repository.findById(id);

        return shopOrder.map(orderMapper::toDTO).orElseThrow(() -> new RuntimeException("No se encontro la orden"));
    }


    private ShopOrder buildShopOrder( List<ShoppingCart> shoppingCartList, BigDecimal totalAmount) {

        return ShopOrder.builder()
                .products(shoppingCartList)
                .totalAmount(totalAmount)
                .orderDate(LocalDateTime.now())
                .build();
    }
}
