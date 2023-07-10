package ar.com.lokywolf2295.proyectocarritodecompras.service.impl;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ShopOrderDto;
import ar.com.lokywolf2295.proyectocarritodecompras.model.entity.ShopOrder;
import ar.com.lokywolf2295.proyectocarritodecompras.repository.ShopOrderRepository;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IShopOrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopOrderServiceImpl implements IShopOrderService {

    private final ShopOrderRepository repository;

    @Override
    public ShopOrder createShopOrder( ShopOrderDto orderDto) {
        ShopOrder order = new ShopOrder();
        order.setProducts(orderDto.getCart());
        repository.save(order);
        return order;
    }
}
