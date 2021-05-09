package com.example.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Resources {

    @RequestMapping("/")
    public String login() {
        return "Login";
    }
}
