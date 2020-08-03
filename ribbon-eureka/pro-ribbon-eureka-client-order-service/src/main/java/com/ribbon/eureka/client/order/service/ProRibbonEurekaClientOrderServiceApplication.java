package com.ribbon.eureka.client.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProRibbonEurekaClientOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProRibbonEurekaClientOrderServiceApplication.class, args);
    }

}
