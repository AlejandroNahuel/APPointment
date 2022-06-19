package com.alejandronahuel.APPointment.APPointment.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitController {
    
    @GetMapping("/")
    public String inicio (Model model){
        return "index";
    }
}
