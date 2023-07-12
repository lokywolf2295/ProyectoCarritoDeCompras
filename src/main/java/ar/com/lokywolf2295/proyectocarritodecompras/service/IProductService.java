package ar.com.lokywolf2295.proyectocarritodecompras.service;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ProductRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ProductRequestUpdateDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ProductResponseDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import org.springframework.data.domain.Page;

public interface IProductService {

    ProductResponseDTO createProduct(ProductRequestDTO productRequestDto);

    ProductResponseDTO updateProduct(Long id, ProductRequestUpdateDTO productRequestUpdateDTO);

    void deleteProduct(Long id);

    Product getProductById(Long id);

    ProductResponseDTO getProductDetails(Long id);

    Page<ProductResponseDTO> getAllProducts(int page);

    void quantityVerification(Product product, int quantity);

    void updateQuantity(Product product, int quantity);
}
