package com.example.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Hero {
    private String id;
    private String name;
    private int age;
    private String level;
    private String intelligence;
    private String strength;
    private String agile;

    public Hero(String id){
        this.id =id;
        this.setName("老瓜皮没名字");
        this.setAge(0);
        this.setLevel("0");
        this.setAgile("0");
        this.setIntelligence("0");
        this.setStrength("0");


    }
    public Hero(){

    }
}
