package com.madeeasy.controller;

import com.madeeasy.config.WelcomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private  WelcomeClient welcomeClient;
    @GetMapping("/")
    public String welcome() {
        String welcome = welcomeClient.getWelcome();
        return "<h1>Welcome!</h1>";
    }

}
