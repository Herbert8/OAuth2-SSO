package com.example.ssoclient2.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class MyCtrl {

    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

}
