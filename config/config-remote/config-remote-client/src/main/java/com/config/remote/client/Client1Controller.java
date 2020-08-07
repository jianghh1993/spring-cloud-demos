package com.config.remote.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Client1Controller {

    @Value("${foo}")
    private String foo;

    @GetMapping("/test")
    public String test(){
        return "test foo";
    }

    @GetMapping("/foo")
    public String foo(){
        return foo;
    }


}
