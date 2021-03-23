package com.pcy.circular;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 17:00
 */
public class Class1 {
    private Class2 c2;

    public Class1() {
        System.out.println("Class1实例化了一个对象");
    }

    public void init(){
        System.out.println("Class1的对象执行了初始化方法");
    }
    public Class2 getC2() {
        return c2;
    }

    public void setC2(Class2 c2) {
        this.c2 = c2;
    }
}
