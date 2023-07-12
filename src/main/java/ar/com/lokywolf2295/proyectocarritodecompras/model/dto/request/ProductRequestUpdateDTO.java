package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestUpdateDTO {

    private String name;
    private String category;
    private String description;
    private double price;
    private int quantity;
    private String photo;
    private boolean enabled;
}
