package com.rockies.DaeguDay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/front/login")
    public String log(){
        return "login";
    }
    @GetMapping("/front/myNews")
    public String myNews(){
        return"myNews";
    }
}
