package com.pcy.beanpostprocessor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author chunyue_peng
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RoutingInjected {
    String value() default "helloServiceImpl1";
}
