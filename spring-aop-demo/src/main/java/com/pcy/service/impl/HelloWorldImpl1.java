package com.pcy.service.impl;

import com.pcy.service.HelloWorld;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 10:20
 */
public class HelloWorldImpl1 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("------11111------按下HelloWorld1.printHelloWorld()-----11111111-------");
    }

    @Override
    public void doPrint() {
        System.out.println("------1111111------打印HelloWorldImpl1-----1111111------");
    }
}
