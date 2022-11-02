package com.example.springproektche;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class info {

    @GetMapping()
    public String info(){
        return "Hello World";
    }
}
