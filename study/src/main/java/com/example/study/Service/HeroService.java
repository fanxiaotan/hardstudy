package com.example.study.Service;

import com.example.study.entity.Hero;
import com.example.study.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HeroService {
    @Autowired
    private HeroMapper tHeroMapper ;
    public List<Hero> getHeros(){
        return  tHeroMapper.getHeros();

    }
    public  Hero getHeroByID(String id ){
        return  tHeroMapper.getHeroByID(id);
    }

    public String getMaxHeroID(){
        return  tHeroMapper.getMaxHeroID();
    }


    public Hero saveHero(Hero tHero){
        tHeroMapper.saveHero(tHero);
        return  tHero;
    }

    public boolean judgeExists(String id,String name,int age){
       if(tHeroMapper.judgeExists(id,name,age)>0){
           System.out.println("id，name,age相同的英雄已存在");
            return true;
       }else{
            return false;
        }
    }

    public boolean judgeExists(Hero tHero){
       return judgeExists(tHero.getId(),tHero.getName(),tHero.getAge());
    }

    public void deletHero(String id){
        tHeroMapper.deleteHero(id);

    }
    public void updateHero(Hero tHero){
        tHeroMapper.updateHero(tHero);
    }

    public List<HashMap<String,Object>> getUserHero(){
        return tHeroMapper.getUserHero();

    }
}
