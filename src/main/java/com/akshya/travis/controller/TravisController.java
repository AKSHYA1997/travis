package com.akshya.travis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravisController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }
}
