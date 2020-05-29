package com.skuldmoon.springcloud.controller;

import com.skuldmoon.springcloud.feign.ServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ServerFeign serverFeign;

    @Value("${nickname}")
    private String nickname;

    @GetMapping("/hello")
    public String hello() {
        return "Hello : " + nickname;
    }

    @GetMapping("/test")
    public String call() {
        System.out.println("call test ---");
        return serverFeign.call();
    }

}
