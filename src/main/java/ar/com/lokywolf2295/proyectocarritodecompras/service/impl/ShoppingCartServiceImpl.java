package ar.com.lokywolf2295.proyectocarritodecompras.service.impl;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShopingRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import ar.com.lokywolf2295.proyectocarritodecompras.model.mapper.ShoppingCartMapper;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IProductService;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IShopOrderService;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IShoppingCartService;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;
import ar.com.lokywolf2295.proyectocarritodecompras.repository.IShoppingCartRepository;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShopOrderDto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShoppingCartServiceImpl implements IShoppingCartService {

    private final IProductService productService;
    private final ShoppingCartMapper shoppingCartMapper;
    private final IShopOrderService orderService;
    public IShoppingCartRepository repository;    //al instanciar la clase ICarritoRepository, puedo usar los metodos de JpaRepository
   
    //Implementacion de los metodos de la Interfase "IShoppingCartService"
    @Override
    public void createShoppingCart(ShopingRequestDTO shopingRequestDTO) {
        List<ShoppingCart> items = shopingRequestDTO.getCart().stream()
                .map(i -> shoppingCartMapper.toEntity(i, productService.getProductById(i.getId())))
                .collect(Collectors.toList());

        ShopOrderDto orderDto = new ShopOrderDto(items, shopingRequestDTO.getTotalAmount());
        ShopOrder order = orderService.createShopOrder( orderDto);

        items.forEach(i-> {
            i.setShopOrder(order);
            repository.save(i);
        } );
    }
}
