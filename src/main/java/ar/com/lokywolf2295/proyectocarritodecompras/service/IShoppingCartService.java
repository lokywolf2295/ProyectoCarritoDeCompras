package ar.com.lokywolf2295.proyectocarritodecompras.service;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShopingRequestDTO;

public interface IShoppingCartService {

    //declaro los metodos a implementar en la clase CarritoServiceImpl
     void createShoppingCart(ShopingRequestDTO shopingRequestDTO);
}
