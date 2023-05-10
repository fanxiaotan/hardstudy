package com.example.study.Utils;

import com.example.study.Service.HeroService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


@Component
@Aspect
public class AspectJ {
    private static final Logger logger = Logger.getLogger(String.valueOf(AspectJ.class));

    @Autowired
    HeroService tHeroService;
    @Pointcut("execution(* com.example.study.controller.HeroController.*(..))")
 //   @Pointcut("execution(* com.example.study.Service.HeroService.judgeExists(..))")
    private void ponitCut() {}

    @Around("ponitCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("-------------------------------------------开始增强-------------------------------------");
        // 前增强
        Object[] args = proceedingJoinPoint.getArgs();
        List<Object> alist = Arrays.asList(args);

        logger.info(System.currentTimeMillis()+"正在执行"+proceedingJoinPoint.getSignature()+"方法");
        logger.info("参数列表如下：");
        alist.stream().forEach(System.out::println);
        // 调用目标方法
        Object object = proceedingJoinPoint.proceed();
        // 返回目标方法的返回值
        return object;
    }

}
