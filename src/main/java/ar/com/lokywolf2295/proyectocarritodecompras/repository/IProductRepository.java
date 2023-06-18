package ar.com.lokywolf2295.proyectocarritodecompras.repository;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {  //  <objeto a persistir, tipo de dato>

    Page<Product> findAll(Specification<Product> specification, Pageable pageable); //  Esto es para buscar por páginas

    @Query(value = "SELECT * FROM products WHERE name LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    Page<Product> findAllByName(String query, Pageable pageable);


}
