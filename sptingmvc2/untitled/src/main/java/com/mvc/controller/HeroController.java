package com.mvc.controller;

import com.mvc.dao.Hero;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {
    @PostMapping
    public String save(Hero hero){
        System.out.println("��ʼ����Ӣ����Ϣ-------------------------");


        return "index";
    }

    @PutMapping
    public String see(){
        return "index";
    }
}
