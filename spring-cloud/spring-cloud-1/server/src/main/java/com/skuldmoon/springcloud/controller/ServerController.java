package com.skuldmoon.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("call")
    public String call() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Call service success!");
        return "Call service success!";
    }

}
