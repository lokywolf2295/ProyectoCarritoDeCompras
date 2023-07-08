package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class ShopOrderDto {
    private List<Product> cart;
    private String typeOfPayment;
    private BigDecimal totalAmount;
}
