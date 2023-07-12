package ar.com.lokywolf2295.proyectocarritodecompras.service;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShoppingRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ShopOrderResponseDTO;

public interface IShopOrderService {

    ShopOrderResponseDTO createShopOrder (ShoppingRequestDTO shoppingRequestDTO);

    ShopOrderResponseDTO getShopOrderDetails(Long id);
}