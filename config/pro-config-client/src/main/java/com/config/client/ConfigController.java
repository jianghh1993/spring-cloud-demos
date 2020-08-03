package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${foo}")
    String foo;


    @GetMapping("/foo")
    public String getFoo(){
        return foo;
    }
}
