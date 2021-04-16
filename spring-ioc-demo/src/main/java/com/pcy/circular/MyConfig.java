package com.pcy.circular;

import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:23
 */
public class MyConfig {
    @Bean
    public A c1(){
        return new A();
    }
    @Bean
    public B cw(){
        return new B();
    }
}
