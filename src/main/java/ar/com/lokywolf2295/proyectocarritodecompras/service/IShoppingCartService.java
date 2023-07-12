package ar.com.lokywolf2295.proyectocarritodecompras.service;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;

import java.math.BigDecimal;

public interface IShoppingCartService {

    //declaro los metodos a implementar en la clase CarritoServiceImpl
     ShoppingCart createShoppingCart(Product product, int quantity, BigDecimal price);

     void appendOrder(ShoppingCart cart,ShopOrder order);
}
