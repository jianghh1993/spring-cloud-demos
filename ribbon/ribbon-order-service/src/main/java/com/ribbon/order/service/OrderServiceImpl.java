package com.ribbon.order.service;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl  implements OrderService{
    @Override
    public List<OrderInfo> queryOrdersByUserId(int userId) {
        return null;
    }

    @Override
    public OrderInfo queryOrderByOrderId(int orderId) {
        return null;
    }

    @Override
    public OrderInfo createOrder(OrderInfo orderInfo) {
        return null;
    }

    @Override
    public OrderInfo modifyOrder(OrderInfo orderInfo) {
        return null;
    }

    @Override
    public void deleteOrder(int orderId) {

    }
}
