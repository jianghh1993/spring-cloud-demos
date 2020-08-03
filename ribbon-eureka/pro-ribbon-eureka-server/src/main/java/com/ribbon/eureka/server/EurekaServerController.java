package com.ribbon.eureka.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServerController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to Eureka Server";
    }
}
