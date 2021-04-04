package com.japp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JHomeController {

    @RequestMapping(path = "/*")
    public String sayhello(){
        return "Hello!";
    }
}
