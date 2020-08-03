package com.ribbon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order/")
public class OrderController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    @ResponseBody
    public OrderInfo createOrder(@RequestBody OrderInfo orderInfo){
        orderInfo = orderService.createOrder(orderInfo);
        return orderInfo;
    }

    @PostMapping("/updateOrder")
    @ResponseBody
    public Map<?,?> updateOrder(@RequestBody OrderInfo orderInfo){
        orderInfo = orderService.modifyOrder(orderInfo);
        Map<String,String> map = new HashMap<>();
        map.put("status","yes");
        map.put("result","SUCCESS");
        map.put("changeInfo","收货地址有变更,新地址是："+orderInfo.getAddress());
        return map;
    }

    @PostMapping("/deleteOrder")
    @ResponseBody
    public Map<?,?> deleteOrder(@RequestParam("orderId") int orderId){
        orderService.deleteOrder(orderId);
        Map<String,String> map = new HashMap<>();
        map.put("status","yes");
        map.put("result","SUCCESS");
        map.put("changeInfo","订单取消成功");
        return map;
    }

    @GetMapping("/getOrder")
    public OrderInfo getOrder(@RequestParam("orderId") int orderId){
        OrderInfo orderInfo = orderService.queryOrderByOrderId(orderId);
        return orderInfo;
    }

    @PostMapping("/getOrders")
    public List<OrderInfo> getOrderList(@RequestParam("userId")int userId){
        List<OrderInfo> orders = orderService.queryOrdersByUserId(userId);
        return orders;
    }

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("port:"+port);
        return "Welcome to use OrderService";
    }
}
