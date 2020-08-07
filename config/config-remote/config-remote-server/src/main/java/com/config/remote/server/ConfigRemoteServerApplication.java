package com.config.remote.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class ConfigRemoteServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigRemoteServerApplication.class, args);
    }

}
