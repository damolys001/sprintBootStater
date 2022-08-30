package com.example.damolys.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
//@ResponseBody

public class GreetingController {

    @RequestMapping(value = "/", method =  RequestMethod.GET)
    public String getGreeting(){
        return "Hi this greeting from OG";
    }
}
