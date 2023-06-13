package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopingResponseDTO {

    private Long id;
    private List<Product> productsList;
    private boolean enabled;
}
