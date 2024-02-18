package com.example.Devaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ship {


    @GetMapping ("/ship")
    public String getData() {return "Please ebook your ship @70% free of cost Thank you " ; }
}