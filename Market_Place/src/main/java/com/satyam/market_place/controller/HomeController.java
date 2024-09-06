package com.satyam.market_place.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {
    @RequestMapping("/")
    public String greeting(){
        return  "Welcome to my site";
    }
}
