package com.pcy.beanpostprocessor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author chunyue_peng
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RoutingSwitch {
    /**
     * 在配置系统中开关的属性名称，应用系统将会实时读取配置系统中
     * 对应开关的值来决定调用那个版本
     * @return
     */
    String value() default "";
}
