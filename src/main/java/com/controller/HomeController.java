package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/greet")
    public String greet() {
        return "greet";
    }

    @RequestMapping("/sayHello")
    public String sayHello(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        model.addAttribute("uname", username.toUpperCase());
        return "say-hello";
    }

    @RequestMapping("/sayHello2")
    public String sayHello2(@RequestAttribute("username") String username, Model model) {
        model.addAttribute("uname", username.toUpperCase());
        return "say-hello";
    }
}
