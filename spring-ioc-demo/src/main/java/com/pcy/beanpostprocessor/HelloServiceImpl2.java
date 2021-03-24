package com.pcy.beanpostprocessor;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:41
 */
public class HelloServiceImpl2 implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello from HelloServiceImpl2");
    }
}
