package com.pcy.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 19:30
 */
public class RoutingBeanPostProcessor implements BeanPostProcessor {
    private ApplicationContext ac;

    public void setAc(ApplicationContext ac) {
        this.ac = ac;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(">>postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization>>");
        Class<?> clazz = bean.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(RoutingInjected.class)) {
                if (!field.getType().isInterface()) {
                    throw new BeanCreationException("RoutingInjected field must be declared ans an" +
                            "interface:" + field.getName() + "@Class" + clazz.getName());
                }
                try {
                    this.handleRoutingInjected(field, bean, field.getType());
                } catch (IllegalAccessError | IllegalAccessException e) {
                    throw new BeanCreationException("Exception thrown when handleAutowireRouting", e);
                }
            }
        }
        return bean;
    }

    private void handleRoutingInjected(Field field, Object bean, Class<?> type) throws IllegalAccessException {
        Map<String, ?> candidates = this.ac.getBeansOfType(type);
        field.setAccessible(true);
        if (candidates.size() == 1) {
            field.set(bean, candidates.values().iterator().next());
        } else if (candidates.size() == 2) {
//            Object proxy = RoutingBeanProxyFactory.createProxy(type, candidates);
        } else {
            throw new IllegalArgumentException("Find more than 2 beans for type:" + type);
        }
    }
}
