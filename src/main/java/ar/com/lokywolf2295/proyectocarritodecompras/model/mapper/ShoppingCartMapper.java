package ar.com.lokywolf2295.proyectocarritodecompras.model.mapper;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapper {

    public ShoppingCart toEntity (Product dto, Product product){
        ShoppingCart item = new ShoppingCart();
        item.setProduct(product);
        item.setProductQuantity(dto.getQuantity());
        return item;
    }
}
