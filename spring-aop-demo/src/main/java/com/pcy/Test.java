package com.pcy;

import com.pcy.service.HelloWorld;
import com.pcy.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 10:25
 */
public class Test {
    public static void main(String[] args){
//        ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");
//        HelloWorld hw1 = (HelloWorld) appCtx.getBean("proxy");
//        HelloWorld hw2 = (HelloWorld) appCtx.getBean("proxy2");
//        hw1.printHelloWorld();
//        hw1.doPrint();
//        System.out.println();
//        hw2.printHelloWorld();
//        hw2.doPrint();

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person bean2 = (Person)ac.getBean("student");
        bean2.say();


    }
}
