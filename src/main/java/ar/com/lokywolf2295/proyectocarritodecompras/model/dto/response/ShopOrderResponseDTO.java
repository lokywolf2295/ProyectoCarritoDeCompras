package ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopOrderResponseDTO {
    private Long id;
    private LocalDateTime orderDate;
    private List<ShoppingResponseDTO> cart;
    private BigDecimal totalAmount;
}
