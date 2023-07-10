package ar.com.lokywolf2295.proyectocarritodecompras.repository;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopOrderRepository extends JpaRepository<ShopOrder,Long> {
}
