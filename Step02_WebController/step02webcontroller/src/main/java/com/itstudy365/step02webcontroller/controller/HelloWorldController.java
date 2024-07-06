package com.itstudy365.step02webcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "SpringBoot");
        return "greeting";
    }
}
