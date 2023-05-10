package com.example.study.mapper;

import com.example.study.entity.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface HeroMapper {
   List<Hero> getHeros();
   Hero getHeroByID(@Param("id") String id);
   String getMaxHeroID();
   void saveHero(Hero tHero);
   int judgeExists(String id,String name,int age);
   void deleteHero(String id);
   void updateHero(Hero tHero);
   List<HashMap<String,Object>>  getUserHero();

}
