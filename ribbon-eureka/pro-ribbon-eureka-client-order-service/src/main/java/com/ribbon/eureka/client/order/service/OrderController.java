package com.ribbon.eureka.client.order.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/orders")
    public String getOrders(){
        System.out.println("port:"+port);
        return "Welcome to Order Service "+port;
    }
}
