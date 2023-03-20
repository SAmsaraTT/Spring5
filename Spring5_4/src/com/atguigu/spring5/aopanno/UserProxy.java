package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description advice
 * @Author hliu
 * @Date 2023/3/19 21:42
 * @Version 1.0
 */
@Component
@Aspect
@Order(3) //执行优先级
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointCut() {

    }


    //前置通知
    //@Before注解
    @Before(value = "pointCut()")
    public void before() {
        System.out.println("before.....");
    }

    /**
     * 最终通知
     */
    @After(value = "pointCut()")
    public void after() {
        System.out.println("after.........");
    }

    /**
     * 后置通知
     */
    @AfterReturning(value = "pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }

    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");

        //被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.........");
    }
}
