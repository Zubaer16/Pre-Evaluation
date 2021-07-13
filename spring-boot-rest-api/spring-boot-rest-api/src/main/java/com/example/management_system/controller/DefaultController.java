package com.example.management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/zubaer/management")
    public String printSomething(){
        return "Hello zubaer";
    }
}

