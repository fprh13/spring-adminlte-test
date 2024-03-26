package com.example.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginP(Model model) {
        String hello = "hello word";
        model.addAttribute("hello", hello);
        return "login";
    }
}
