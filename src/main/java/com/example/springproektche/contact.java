package com.example.springproektche;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contact {

    @GetMapping("/contact")
    public String info(){
        return "email address: SDDimitrov18@codingburgas.bg";
    }
}