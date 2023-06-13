package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ShopingRequestDTO {

    @NotNull
    private List<Product> productsList;
    private boolean enabled;
}
