package com.pcy.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 17:44
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Circular.xml");
//        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
//        Class1 c1 = (Class1) ac.getBean("c1");

    }
}
