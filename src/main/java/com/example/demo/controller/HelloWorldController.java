package com.example.demo.controller;

import com.example.demo.logic.HelloWorldLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldLogic helloWorldLogic;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return helloWorldLogic.getHelloWorld();
    }
}
