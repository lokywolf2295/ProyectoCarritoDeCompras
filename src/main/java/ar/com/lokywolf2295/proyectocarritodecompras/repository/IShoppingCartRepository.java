package ar.com.lokywolf2295.proyectocarritodecompras.repository;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {  //  <objeto a persistir, tipo de dato>

}
