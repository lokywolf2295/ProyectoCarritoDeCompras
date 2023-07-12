package ar.com.lokywolf2295.proyectocarritodecompras.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart") //nombre de la tabla en la BD
@ApiModel("Clase Carrito: entidad que representa el vinculo con los articulos a comprar")
@SQLDelete(sql = "UPDATE cart SET enable = false WHERE id = ?")
@Where(clause = "enable = true")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    @ApiModelProperty("Clave primaria autoincremental tipo Long")
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    @ApiModelProperty("Producto que contiene el carrito")
    private Product product; // "carritoProductos" es el atributo de la clase Producto

    @Column(name = "product_qty")
    @ApiModelProperty("Cantidad de productos")
    private Integer productQuantity;

    @Column(name = "price")
    @ApiModelProperty("Precio en pesos argentinos, con 2 decimales, utilizando el . punto como separador")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "shop_order_id")
    private ShopOrder shopOrder;
}
