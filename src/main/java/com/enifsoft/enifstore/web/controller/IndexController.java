package com.enifsoft.enifstore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Principal principal, Model model) {
        //model.addAttribute("bodyFragment", "home");
        return "main";
    }
}
