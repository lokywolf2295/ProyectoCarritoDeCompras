package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductRequestUpdateDTO {

    private String name;
    private String category;
    private String subCategory;
    private String description;
    private double price;
    private int quantity;
    private String photo;
    private boolean enabled;
}
