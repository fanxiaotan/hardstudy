package com.mvc.controller;

import com.mvc.dao.Hero;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {
    @PostMapping
    public String save(Hero hero){
        System.out.println("开始插入英雄信息-------------------------");


        return "index";
    }

    @PutMapping
    public String see(){
        return "index";
    }
}
