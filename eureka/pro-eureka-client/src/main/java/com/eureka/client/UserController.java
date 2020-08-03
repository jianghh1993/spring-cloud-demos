package com.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(C) 2020-2020,java
 * FileName     : UserController
 * Author       : jhh
 * Date         : 2020/7/2416:01
 * Description  :
 * History
 * <author>            <time>          <version>           <desc>
 * 作者                  修改时间        版本号                描述
 */
@RestController
public class UserController {

    @Value("${name}")
    private String name;
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello "+name;
    }
}
