package com.example.zaris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class maincontrol {
    @GetMapping("/administrativo")
    public String acessarPrincipal(){
        return "administrativo/home";
    }
}
