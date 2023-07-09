package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class ShopingRequestDTO {

    @NotNull
    private List<Product> productsList;
    private BigDecimal totalAmount;
    private int quantity;
    private boolean enabled;
}
