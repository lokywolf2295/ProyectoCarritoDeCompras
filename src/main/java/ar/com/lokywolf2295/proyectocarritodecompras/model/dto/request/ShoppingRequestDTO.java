package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingRequestDTO {
    private List<ShoppingItemRequestDTO> cart;
}
