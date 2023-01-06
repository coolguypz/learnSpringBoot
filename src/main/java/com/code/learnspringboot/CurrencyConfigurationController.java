package com.code.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCurrency(){
        return configuration;
    }
}


// Monitoring Application Using Spring Boot Actuator
// Provide a number of endpoints:
//  beans - Complete list of Spring beans in your app
//  health - Application health information
//  metrics - Application metrics
//  mappings - Details around Request Mappings
