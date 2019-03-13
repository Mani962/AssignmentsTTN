package com.aop.springintermedate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class QuestionEight {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("springi-config.xml");
        PointCutExample pointCutExample = ctx.getBean(PointCutExample.class);
        pointCutExample.method1();
        pointCutExample.method2();
    }
}

@Component
class PointCutExample {

    void method1() {
        System.out.println("method1 executed...");
    }

    void method2() {
        System.out.println("method2 executed...");
    }

}

@Component
@Aspect
class PointCutExampleAspect {

    @Before("myPointcut()")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " Started..");
    }

    @After("myPointcut()")
    void afterAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " Stopped..");
    }

    @Pointcut("execution(void *())")
    void myPointcut() {
    }

}