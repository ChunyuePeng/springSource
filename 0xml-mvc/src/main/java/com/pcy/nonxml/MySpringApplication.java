package com.pcy.nonxml;


import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/30 10:25
 */
@ComponentScan
public class MySpringApplication {
    public static void main(String[] args) throws LifecycleException {
        File base = new File(System.getProperty("java.io.tmpdir"));
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.addContext("/",base.getAbsolutePath());
        tomcat.start();

        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(MySpringApplication.class);
        ac.refresh();
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
        Wrapper wrapper = tomcat.addServlet("/", "app", dispatcherServlet);
        wrapper.setLoadOnStartup(1);
        wrapper.addMapping("/");
        tomcat.getServer().await();
    }
}
