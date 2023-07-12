package ar.com.lokywolf2295.proyectocarritodecompras.controller;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShoppingRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ShopOrderResponseDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IShopOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/shopping_cart")
public class ShoppingController {

    @Autowired
    private IShopOrderService shopOrderService;

    @PostMapping("/new_order")
    @ApiOperation("Creación de la Orden de Compra")
    public ResponseEntity<ShopOrderResponseDTO> createProduct (@RequestBody ShoppingRequestDTO shoppingRequestDTO){
        ShopOrderResponseDTO shopOrderResponseDTO = shopOrderService.createShopOrder(shoppingRequestDTO);
        return  ResponseEntity.status(CREATED).body(shopOrderResponseDTO);
    }

    @GetMapping("/details/{id}")
    @ApiOperation("Obtener detalles de la Orden de Compra")
    public ResponseEntity<ShopOrderResponseDTO> getShopOrderDetails(@PathVariable Long id) {
        ShopOrderResponseDTO shopOrderResponseDTO = shopOrderService.getShopOrderDetails(id);
        return ResponseEntity.status(OK).body(shopOrderResponseDTO);
    }
}
