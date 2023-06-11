package ar.com.lokywolf2295.proyectocarritodecompras.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.List;


@Data
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

    @OneToMany(mappedBy = "carts", cascade = CascadeType.ALL)
    @ApiModelProperty("Lista de productos que contiene el carrito")
    private List<Product> productsList; // "carritoProductos" es el atributo de la clase Producto

    @Column(name = "enable")
    @ApiModelProperty("Permite corroborar si el carrito esta habilitado o no")
    private boolean enabled = true;

    public void addProduct(Product objProduct) {
        if (productsList == null) {
            productsList = new ArrayList<>(); //instancio la lista si no existe
        }
        this.productsList.add(objProduct); //agrego objProducto a la lista
        objProduct.setShoppingCartProductos(this); //seteo el Carrito en la clase Producto
    }

    public void removeProduct(Product objProduct) {
        this.productsList.remove(objProduct);
        objProduct.setShoppingCartProductos(null);
    }

    public double totalCartAmount() {
        double initial = 0.00;
        for (Product elem : productsList) {
            initial += elem.getQuantity() * elem.getPrice();
        }
        return initial;
    }
}
