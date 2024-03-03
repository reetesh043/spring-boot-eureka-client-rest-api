package com.example.spring.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello World";
    }
}
