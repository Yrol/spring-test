// HomeController.java
package com.test.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String displayHome(Model model) {
        model.addAttribute("message", "Thank you for visiting.");
        return "home";
    }
}
