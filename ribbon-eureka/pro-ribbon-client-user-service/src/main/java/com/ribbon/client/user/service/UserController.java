package com.ribbon.client.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Value("${service-url.order-service}")
    private String serviceUrl;
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/sayHello1")
    public String sayHello1(){
        return "Welcome to User Service";
    }

    @GetMapping("/sayHello2")
    public String sayHello2(){
        System.out.println("url:"+serviceUrl);
        return restTemplate.getForObject(serviceUrl+"/orders",String.class);
    }

}
