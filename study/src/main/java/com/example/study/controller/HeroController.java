package com.example.study.controller;

import com.example.study.Service.HeroService;
import com.example.study.StudyApplication;
import com.example.study.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/Hero")
public class  HeroController {
    private static final Logger logger = Logger.getLogger(String.valueOf(HeroController.class));
    @Autowired
    HeroService tHeroService;
    @RequestMapping("/Hello")
    public String getHello(String a,int b){
        List<HashMap<String,Object>> userHeroList = tHeroService.getUserHero();
        logger.info("---------------------------------------------");
        userHeroList.stream().forEach(System.out::println);
        logger.info("---------------------------------------------");
        userHeroList.get(0).entrySet().stream().forEach(System.out::println);
        logger.info("---------------------------------------------");
        userHeroList.stream().forEach(s->s.keySet().forEach(System.out::println));

        logger.info(""+a+"!");
        return b+ a+"666";
    }

    @RequestMapping("/msg")
    public List<Hero> getAllHeroMsg(){
       return tHeroService.getHeros();
    }

//    @RequestMapping("/id2")
//    public Hero saveHero(@RequestBody Hero tHero){
//
//        logger.info("--------------开始{}英雄的创建------------"+tHero.getName());
//        if(!tHeroService.judgeExists(tHero)&&ObjectUtils.isEmpty(tHeroService.getHeroByID(tHero.getId()))){
//
//        }else{
//            logger.info("--------------已存在英雄id,开始英雄的创建------------"+tHero.getName());
//            tHero = new Hero(tHero.getId());
//            tHero.setId(Integer.valueOf(tHeroService.getMaxHeroID())+1+"");
//
//        }
//        tHeroService.saveHero(tHero);
//        return tHero;
//    }
    @PostMapping
    public Hero saveHero(@RequestBody Hero tHero){
        logger.info("--------------POST开始{}英雄的创建------------"+tHero.getName());
        if(!tHeroService.judgeExists(tHero)&&ObjectUtils.isEmpty(tHeroService.getHeroByID(tHero.getId()))){

        }else{
            logger.info("--------------已存在英雄id,开始英雄的创建------------"+tHero.getName());
            tHero = new Hero(tHero.getId());
            tHero.setId(Integer.valueOf(tHeroService.getMaxHeroID())+1+"");

        }
        tHeroService.saveHero(tHero);
        return tHero;
    }
    @DeleteMapping("/{id}")
    public String deleteHero(@PathVariable  String id){
        tHeroService.deletHero(id);
        return "delete succ";
    }
    @PutMapping
    public String updateHero(@RequestBody Hero tHero){
        tHeroService.updateHero(tHero);
        return "update succ";
    }

    @GetMapping("/{id}")
    public Hero getHeroMsg(@PathVariable String id){
        logger.info("--------------开始英雄的查询ID------------"+id);
        return tHeroService.getHeroByID(id);
    }


}

