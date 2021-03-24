package com.pcy.service.impl;

import com.pcy.service.Person;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 11:05
 */
public class Student implements Person {
    @Override
    public void say() {
        System.out.println("这是一个苦逼程序员");
    }
}
