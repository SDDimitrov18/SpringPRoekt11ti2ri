package com.example.springproektche;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class about {

    @GetMapping("/about")
    public String info(){
        return "My name is Stoicho, I am 18 years old and I live in Burgas, Bulgaria.";
    }
}