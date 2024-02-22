package com.example.Devaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class car {


    @GetMapping ("/car")
    public String getData() {return "please Ebook your hotel @60% free of cost Thank you again " ; }
}