package com.pcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/29 19:53
 */
@Controller
public class MyController {
    @RequestMapping("sayHello1")
    @ResponseBody
    public String test(){
        return "hello";
    }
}
