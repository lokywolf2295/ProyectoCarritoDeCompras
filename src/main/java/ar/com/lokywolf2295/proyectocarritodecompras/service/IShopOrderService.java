package ar.com.lokywolf2295.proyectocarritodecompras.service;

import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShopOrderDto;
public interface IShopOrderService {

    ShopOrder createShopOrder ( ShopOrderDto order);
}