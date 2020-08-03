package com.ribbon.user.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Atest atest(RestTemplate restTemplate){
        return new Atest();
    }

    @Bean
    public Btest btest(RestTemplate restTemplate){
        return new Btest();
    }

    @Bean
    public Ctest ctest(RestTemplate restTemplate){
        return new Ctest();
    }
}
