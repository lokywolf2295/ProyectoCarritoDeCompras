package ar.com.lokywolf2295.proyectocarritodecompras.service.impl;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.*;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ProductResponseDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.mapper.ProductMapper;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IProductService;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.Product;
import ar.com.lokywolf2295.proyectocarritodecompras.repository.IProductRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Locale;

import static java.lang.Boolean.FALSE;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private static final int PAGE_SIZE = 10;

    private final IProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        Product product = productMapper.toEntity(productRequestDTO);
        productRepository.save(product);
        return productMapper.apply(product);
    }

    @Override
    public ProductResponseDTO updateProduct(Long id, ProductRequestUpdateDTO productRequestUpdateDTO) {
        Product product = getProductById(id);
        productMapper.refreshValues(product, productRequestUpdateDTO);
        return productMapper.apply(productRepository.save(product));
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        product.setEnabled(FALSE);
        productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new NullPointerException(
                String.format(Locale.US, "Product with id %d not found", id)
        ));
    }

    @Override
    public ProductResponseDTO getProductDetails(Long id) {
        return productMapper.apply(getProductById(id));
    }

    @Override
    public Page<ProductResponseDTO> getAllProducts(int page) {
        Pageable pageable = PageRequest.of(page, PAGE_SIZE);
        pageable.next().getPageNumber();
        return productRepository.findAll(pageable).map(productMapper);
    }

    @Override
    public void quantityVerification(Product product, int quantity) {
        if(product.getQuantity() < quantity)
            throw new IllegalArgumentException("No hay stock suficiente del siguiente producto: " + product.getName());
    }

    @Override
    public void updateQuantity(Product product, int quantity) {
        product.setQuantity(product.getQuantity() - quantity);
        productRepository.save(product);
    }
}
