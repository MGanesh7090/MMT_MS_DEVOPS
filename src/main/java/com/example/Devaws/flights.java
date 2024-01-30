package com.example.Devaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class flights {


    @GetMapping ("/flights")
    public String getData() {return "please ebook your flights @70% free of cost Thank you " ; }
}