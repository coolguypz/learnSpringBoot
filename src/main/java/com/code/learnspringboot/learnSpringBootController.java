package com.code.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class learnSpringBootController {

    @RequestMapping("/")
    public String helloWorld(){
        return "hello World from Spring Boot";
    }
}
