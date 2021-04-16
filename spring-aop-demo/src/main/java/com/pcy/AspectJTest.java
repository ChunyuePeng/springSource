package com.pcy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 11:05
 */
@Aspect
public class AspectJTest {
    @Pointcut("execution(* *.say(..))")
    public void test(){}
    @Before("test()")
    public void before(JoinPoint joinPoint){
        System.out.println("before test..");
    }

    @After("test()")
    public void after(JoinPoint joinPoint){
        System.out.println("after test..");
    }

    @Around("test()")
    public Object around(ProceedingJoinPoint p){
        System.out.println("before1");
        Object o = null;
        try {
            //调用拦截器链中的下一个方法
            o = p.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("after1");
        return o;
    }
    public void test1(){

    }

}
