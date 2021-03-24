package com.pcy.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:35
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");
        HelloService helloService = (HelloService) ac.getBean("helloService");
        helloService.sayHello();
    }
}
