package com.vytas.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to GliboGlibi!!";
    }

    @RequestMapping("/about")
    public String easterEgg() {
        return "We only worry about the things that we can change";
    }
}
