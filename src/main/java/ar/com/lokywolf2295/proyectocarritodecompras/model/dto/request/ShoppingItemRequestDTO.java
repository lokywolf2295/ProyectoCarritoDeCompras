package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingItemRequestDTO {

    private long id;
    private int quantity;
    private BigDecimal price;
}
