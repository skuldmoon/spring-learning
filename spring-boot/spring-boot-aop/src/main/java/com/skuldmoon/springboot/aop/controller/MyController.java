package com.skuldmoon.springboot.aop.controller;

import com.skuldmoon.springboot.aop.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/call")
    public String call() {
        String msg = "Hello World!";
        myService.call(msg);
        return msg;
    }

}