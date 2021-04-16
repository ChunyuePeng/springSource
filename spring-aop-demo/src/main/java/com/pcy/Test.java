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
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person bean2 = (Person)ac.getBean("student");
        bean2.say();
    }
}
