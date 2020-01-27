package com.skuldmoon.springcloud.controller;

import com.skuldmoon.springcloud.feign.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    @SuppressWarnings("all")
    private ServiceFeign serviceFeign;

    @Value("${nickname}")
    private String nickname;

    @GetMapping("/hello")
    public String hello() {
        return "Hello : " + nickname;
    }

    @GetMapping("/call")
    public String call() {
        String result = serviceFeign.call();
        return result;
    }

}
