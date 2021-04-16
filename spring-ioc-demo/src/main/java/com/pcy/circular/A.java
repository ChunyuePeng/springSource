package com.pcy.circular;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 17:00
 */
public class A {
    private B b;

    public A() {
        System.out.println("Class1实例化了一个对象");
    }

    public void init(){
        System.out.println("Class1的对象执行了初始化方法");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        System.out.println("设置了属性b");
        this.b = b;
    }
}
