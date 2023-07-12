package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ShoppingResponseDTO {

    private long id;
    private int quantity;
    private BigDecimal price;
}
