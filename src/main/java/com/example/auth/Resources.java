package com.example.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Resources {

    @RequestMapping("/login")
    public String login() {
        return "Login";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
