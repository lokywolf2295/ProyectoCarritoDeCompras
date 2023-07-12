package ar.com.lokywolf2295.proyectocarritodecompras.model.mapper;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ShopOrderResponseDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderMapper {

    private final CartMapper cartMapper;

    public ShopOrderResponseDTO toDTO (ShopOrder order){
        return ShopOrderResponseDTO.builder()
                .id(order.getId())
                .orderDate(order.getOrderDate())
                .cart(order.getProducts().stream().map(cartMapper::toDTO).toList())
                .totalAmount(order.getTotalAmount())
                .build();
    }
}
