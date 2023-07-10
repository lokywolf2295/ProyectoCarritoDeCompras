package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ShopingRequestDTO {

    @NotNull
    private int quantity;
    private boolean enabled;
    private BigDecimal price;
}
