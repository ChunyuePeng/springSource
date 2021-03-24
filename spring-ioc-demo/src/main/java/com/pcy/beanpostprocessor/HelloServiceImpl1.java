package com.pcy.beanpostprocessor;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:32
 */
public class HelloServiceImpl1 implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("hello from HelloServiceImpl1");
    }
    public void init(){
        System.out.println("HelloServiceImpl1执行了初始化方法");
    }
}
