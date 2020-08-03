package com.ribbon.client.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProRibbonClientUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProRibbonClientUserServiceApplication.class, args);
    }

}
