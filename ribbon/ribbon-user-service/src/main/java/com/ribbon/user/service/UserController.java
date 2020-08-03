package com.ribbon.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello1")
    public String sayHello1(){
        return "Welcome to use UserService";
    }

    @GetMapping("/hello2")
    public String sayHello2(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("ribbon-order-service");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/order/hello");
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }

}
