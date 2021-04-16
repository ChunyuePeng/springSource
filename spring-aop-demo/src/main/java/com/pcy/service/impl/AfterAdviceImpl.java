package com.pcy.service.impl;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/4/13 9:55
 */
public class AfterAdviceImpl implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
    }
}
