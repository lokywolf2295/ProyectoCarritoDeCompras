package ar.com.lokywolf2295.proyectocarritodecompras.repository;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {  //  <objeto a persistir, tipo de dato>
}
