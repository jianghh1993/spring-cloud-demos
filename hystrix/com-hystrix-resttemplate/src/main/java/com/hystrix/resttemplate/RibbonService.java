package com.hystrix.resttemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "fallBack")
    @GetMapping("/hello")
    public String hello(String name){
        return restTemplate.getForObject(
                "http://localhost:8080/hello?name="+name,String.class);
    }

    public String fallBack(){
        return "系统繁忙，请稍后重试";
    }
}
