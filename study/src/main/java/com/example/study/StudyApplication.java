package com.example.study;

import com.example.study.Service.HeroService;
import com.example.study.controller.HeroController;
import com.example.study.entity.Hero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@SpringBootApplication
@EnableAspectJAutoProxy
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
//        ApplicationContext context = SpringApplication.run(StudyApplication.class, args);
//        HeroController tHeroController= (HeroController) context.getBean("HeroController");
//        HeroController.getUserHero();
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//         Hero tHero =context.getBean(HeroService.class).getHeroByID("1");
//        System.out.println(tHero);
//        System.out.println("---------------");
    }

}
