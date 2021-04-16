package com.pcy.nonxml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/30 10:43
 */
@RestController
public class MyController {

    //设置 produces 防止中文乱码
    @GetMapping(value = "/test",produces = "application/json; charset=utf-8")
    public String test(){
        return "this is nonxml project";
    }
}

