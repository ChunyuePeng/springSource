package com.pcy.circular;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 17:00
 */
public class B {
    private A a;

    public B() {
        System.out.println("Class2实例化了一个对象");
    }
    public void init(){
        System.out.println("Class2的实例执行了初始化方法");
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        System.out.println("设置了属性a");
        this.a = a;
    }
}
