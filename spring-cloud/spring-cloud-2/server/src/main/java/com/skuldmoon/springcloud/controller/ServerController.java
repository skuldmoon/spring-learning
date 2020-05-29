package com.skuldmoon.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/shortCall")
    public String shortCall() throws InterruptedException {
        System.out.println("Call service success!");
        return "Call service success!";
    }

    @GetMapping("/longCall")
    public String longCall() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Call service success!");
        return "Call service success!";
    }

}
