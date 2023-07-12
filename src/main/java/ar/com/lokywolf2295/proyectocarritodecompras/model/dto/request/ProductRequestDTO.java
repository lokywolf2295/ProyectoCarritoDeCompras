package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {

    @NotNull
    private String name;
    @NotNull
    private String category;
    @NotNull
    private String description;
    @NotNull
    private double price;
    @NotNull
    private int quantity;
    private String photo;
    private boolean enabled;
}
