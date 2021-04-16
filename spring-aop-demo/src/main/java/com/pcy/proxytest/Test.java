package com.pcy.proxytest;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 14:22
 */
public class Test {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.sayHello();
    }
}
