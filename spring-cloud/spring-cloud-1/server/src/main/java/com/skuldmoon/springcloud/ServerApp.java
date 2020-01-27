package com.skuldmoon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(com.skuldmoon.springcloud.ServerApp.class, args);
    }

}
