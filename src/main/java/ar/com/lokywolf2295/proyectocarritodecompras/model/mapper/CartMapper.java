package ar.com.lokywolf2295.proyectocarritodecompras.model.mapper;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ShoppingResponseDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;
import org.springframework.stereotype.Component;

@Component
public class CartMapper {
    ShoppingResponseDTO toDTO (ShoppingCart shoppingCart){
        return ShoppingResponseDTO.builder()
                .id(shoppingCart.getId())
                .price(shoppingCart.getPrice())
                .quantity(shoppingCart.getProductQuantity())
                .build();
    }
}
