package ar.com.lokywolf2295.proyectocarritodecompras.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "shop_orders")
@Entity
public class ShopOrder {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "shopOrder")
    private List<ShoppingCart> products;

    @Column(name = "order_total")
    private BigDecimal orderTotal;
}
