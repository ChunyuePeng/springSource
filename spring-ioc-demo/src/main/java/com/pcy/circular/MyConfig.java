package com.pcy.circular;

import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:23
 */
public class MyConfig {
    @Bean
    public Class1 c1(){
        return new Class1();
    }
    @Bean
    public Class2 cw(){
        return new Class2();
    }
}
