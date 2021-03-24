package com.pcy.service.impl;

import com.pcy.service.HelloWorld;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 10:21
 */
public class HelloWorldImpl2 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("------222222------按下HelloWorld2.printHelloWorld()------2222222------");
    }

    @Override
    public void doPrint() {
        System.out.println("-------22222-----打印HelloWorldImpl2------22222-----");
    }
}
