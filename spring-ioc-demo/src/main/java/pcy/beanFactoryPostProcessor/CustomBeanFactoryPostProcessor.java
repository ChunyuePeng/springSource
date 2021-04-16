package pcy.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/31 11:32
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("enter into postProcessBeanFactory");
        BeanDefinition be = beanFactory.getBeanDefinition("a");
        //获取到beanDefinition之后你可以对其进行修改等操作
    }
}
