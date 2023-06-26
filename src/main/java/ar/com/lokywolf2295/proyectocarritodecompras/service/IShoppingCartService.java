package ar.com.lokywolf2295.proyectocarritodecompras.service;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShopingRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.response.ShopingResponseDTO;

public interface IShoppingCartService {

    //declaro los metodos a implementar en la clase CarritoServiceImpl
     ShopingResponseDTO createShoppingCart(ShopingRequestDTO shopingRequestDTO);
}
