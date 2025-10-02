package com.example.system_auto_build.config;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
@Component
public class LoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.system_auto_build.controller..*(..))")
    public void beforeController(JoinPoint joinPoint){

       Signature signature=joinPoint.getSignature();
       String className=signature.getDeclaringType().getSimpleName();
       String methodName=signature.getName();
       log.info("Calling :: {} :: {} ()",className,methodName);


    }


    @After("execution(* com.example.system_auto_build.controller..*(..))")
    public void afterController(JoinPoint joinPoint){

        Signature signature=joinPoint.getSignature();
        String className=signature.getDeclaringType().getSimpleName();
        String methodName=signature.getName();
        log.info("End calling :: {} :: {} ()",className,methodName);


    }
}
