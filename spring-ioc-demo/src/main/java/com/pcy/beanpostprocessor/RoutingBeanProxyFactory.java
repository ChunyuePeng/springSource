package com.pcy.beanpostprocessor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

import java.util.Map;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:56
 */
public class RoutingBeanProxyFactory {
    public static Object createProxy(Class targetClass, Map<String, ?> beans){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(targetClass);
        proxyFactory.addAdvice(new VersionRoutingMethodIntercepter(targetClass, (Map<String, Object>) beans));
        return proxyFactory.getProxy();
    }

    private static class VersionRoutingMethodIntercepter implements Advice {
        public VersionRoutingMethodIntercepter(Class targetClass, Map<String, Object> beans) {
        }
    }
}
