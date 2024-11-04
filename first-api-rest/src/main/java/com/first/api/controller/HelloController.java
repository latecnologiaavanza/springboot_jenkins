package com.first.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String saludar(){
        return "Hola Mundo con REST en Spring Boot";
    }

    //new commnte
    @GetMapping("/hello2")
    public String saludar2(){
        return "Hola Mundo con REST en Spring Boot";
    }

}
