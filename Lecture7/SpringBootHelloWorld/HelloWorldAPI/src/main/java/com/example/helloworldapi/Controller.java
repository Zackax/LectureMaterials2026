package com.example.helloworldapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class Controller {
    int numberOfUsage = 0;
    @GetMapping
    public String test(){
        numberOfUsage++;
        return "Hello Spring Boot! usage number: " + numberOfUsage;
    }

}
