package com.example.ssoserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCtrl {

    @GetMapping("/get")
    public Object testGet() {
        return "hello";
    }

}
