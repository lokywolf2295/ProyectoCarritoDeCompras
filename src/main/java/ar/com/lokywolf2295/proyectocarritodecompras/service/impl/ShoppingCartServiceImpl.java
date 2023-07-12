package ar.com.lokywolf2295.proyectocarritodecompras.service.impl;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IShoppingCartService;
import ar.com.lokywolf2295.proyectocarritodecompras.repository.IShoppingCartRepository;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ShoppingCartServiceImpl implements IShoppingCartService {
    private final IShoppingCartRepository repository;    //al instanciar la clase ICarritoRepository, puedo usar los metodos de JpaRepository
   
    //Implementacion de los metodos de la Interfase "IShoppingCartService"
    @Override
    public ShoppingCart createShoppingCart(Product product, int quantity, BigDecimal price) {
        ShoppingCart shoppingCart = ShoppingCart.builder()
                .product(product)
                .productQuantity(quantity)
                .price(price)
                .build();

        return repository.save(shoppingCart);
    }

    @Override
    public void appendOrder(ShoppingCart cart,ShopOrder order) {
        cart.setShopOrder(order);
        repository.save(cart);
    }
}
