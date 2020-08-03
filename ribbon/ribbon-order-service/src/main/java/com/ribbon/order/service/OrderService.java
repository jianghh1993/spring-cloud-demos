package com.ribbon.order.service;

import java.util.List;

public interface OrderService {


    /**
     * 查询用户的所有订单
     * @param userId
     * @return
     */
    List<OrderInfo> queryOrdersByUserId(int userId);

    /**
     * 查询指定订单
     * @param orderId
     * @return
     */
    OrderInfo queryOrderByOrderId(int orderId);

    /**
     * 创建订单
     * @param orderInfo
     */
    OrderInfo createOrder(OrderInfo orderInfo);

    /**
     * 订单变更
     * @param orderInfo
     */
    OrderInfo modifyOrder(OrderInfo orderInfo);

    /**
     * 取消订单
     * @param orderId
     */
    void deleteOrder(int orderId);


}
