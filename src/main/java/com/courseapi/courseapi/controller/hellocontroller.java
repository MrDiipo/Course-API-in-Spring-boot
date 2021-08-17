package com.courseapi.courseapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
