package com.code.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class learnSpringBootController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello World from Spring Boot";
    }
}


// Spring Boot provides variety of starter projects:
// Web Application & REST API  - Spring Boot Starter Web (spring-webmvc, spring-web,spring-boot-starter-tomcat,spring-boot-starter-json)
// Unit Tests - Spring Boot Starter Test
// Talk to database using JPA - Spring Boot Starter Data JPA
// Talk to database using JDBC - Spring Boot Starter JDBC
// Secure your web application or REST API - Spring Boot Starter Security