package com.thym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping(value = "/welcome")
    public String About(Model model){
        return "Inside about handler [new change]";
//        model.addAttribute("name","Nikhil");
//        return "about";
    }
    @GetMapping(value = "/main")
    public String About(Model model){
        return "Nikhil Madaan";
//        model.addAttribute("name","Nikhil");
//        return "about";
    }
 
}
