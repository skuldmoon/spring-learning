package com.skuldmoon.springboot.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void call(String msg) {
        System.out.println("Call: " + msg);
    }

}