package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String getSaludo(){
        return "Hola mundo desde el microservicio-1 en la version1";
    }
}
