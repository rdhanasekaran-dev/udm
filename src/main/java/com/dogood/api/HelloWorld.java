package com.dogood.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello")
    String sayHello(){
        return "Hello";
    }
}
