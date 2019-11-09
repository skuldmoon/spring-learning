package com.skuldmoon.springboot.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.skuldmoon.springboot.aop.service.MyService.call(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void beforeCall() {
        System.out.println("Before call");
    }

    @After("pointCut()")
    public void afterCall() {
        System.out.println("After call");
    }

    @AfterReturning("pointCut()")
    public void afterCallReturning() {
        System.out.println("After call returning");
    }

    @AfterThrowing("pointCut()")
    public void afterCallThrowing() {
        System.out.println("After call throwing");
    }

    @Around("pointCut()")
    public Object aroundCall(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around start");
        Object result = pjp.proceed(new Object[]{"No Hello World!"});
        System.out.println(result);
        System.out.println("Around end");
        return result;
    }

}