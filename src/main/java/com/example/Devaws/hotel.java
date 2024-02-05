package com.example.Devaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hotel {


    @GetMapping ("/hotel"):
    public String getData() {return "please Ebook your Hotel @60% free of cost Thank you " ; }
}