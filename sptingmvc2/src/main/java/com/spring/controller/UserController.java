package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/save")
    public void save(){
        System.out.println("烦死了");
    }
}
