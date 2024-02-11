package com.example.Devaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class train {


    @GetMapping ("/train")
    public String getData() {return "please ebook your train @40% free of cost Thank you " ; }
}