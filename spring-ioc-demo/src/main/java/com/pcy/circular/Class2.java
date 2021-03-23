package com.pcy.circular;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 17:00
 */
public class Class2 {
    private Class1 c1;

    public Class2() {
        System.out.println("Class2实例化了一个对象");
    }
    public void init(){
        System.out.println("Class2的实例执行了初始化方法");
    }

    public Class1 getC1() {
        return c1;
    }

    public void setC1(Class1 c1) {
        this.c1 = c1;
    }
}
