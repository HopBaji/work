package com.example.demo.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Controller
public class controller {
    @GetMapping("/start")

    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/welcom")
    public String greeting(Model model){
        model.addText("message");
        return "greating";
    }
}

