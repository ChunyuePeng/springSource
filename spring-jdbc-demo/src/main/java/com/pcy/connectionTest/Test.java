package com.pcy.connectionTest;

import com.pcy.dao.User;
import com.pcy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 16:31
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = act.getBean(UserService.class);
        User user = new User();
        user.setName("悦哥");
        user.setAge(24);
        user.setSex("男");
        try {
            userService.save(user);
        } catch (Exception e) {
            System.out.println("发生了异常:"+e.getMessage());
        }
        for (User u : userService.getUsers()) {
            System.out.println(u.getName());
        }

    }
}
