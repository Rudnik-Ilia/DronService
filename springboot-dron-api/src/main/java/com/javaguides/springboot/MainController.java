package com.javaguides.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String CheckWelcome(){
        return "Im MainController!";
    }
}cd
