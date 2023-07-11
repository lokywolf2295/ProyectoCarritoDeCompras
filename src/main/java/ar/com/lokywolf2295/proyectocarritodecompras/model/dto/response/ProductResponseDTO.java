package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {

    private Long id;
    private String name;
    private String category;
    private String description;
    private double price;
    private int quantity;
    private String photo;
    private boolean enabled;
}
