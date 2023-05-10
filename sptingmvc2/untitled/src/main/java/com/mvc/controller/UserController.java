package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/user")
@RestController
public class UserController {

    @ResponseBody

    public String save(){
        System.out.println("°¦");
        return "index";
    }

    @RequestMapping("/see")
    public String see(){
        return "index";
    }
}
