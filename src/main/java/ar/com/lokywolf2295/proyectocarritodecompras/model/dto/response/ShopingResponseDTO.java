package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ShopingResponseDTO {

    private List<Product> productsList;
    private boolean enabled;
}
