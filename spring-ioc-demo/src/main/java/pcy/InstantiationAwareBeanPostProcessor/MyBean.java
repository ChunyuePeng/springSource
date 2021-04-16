package pcy.InstantiationAwareBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.util.StringValueResolver;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/19 10:30
 */
public class MyBean implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, EnvironmentAware,
        EmbeddedValueResolverAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyBean() {
        System.out.println("实例化bean对象");
    }

    private String name;

    @Override
    public void setBeanName(String name) {
        System.out.println("执行了BeanNameAware接口");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("执行了BeanClassLoaderAware接口");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("执行了BeanFactoryAware接口");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("执行了ApplicationContextAware接口");
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println("执行了EmbeddedValueResolverAware接口");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("执行了EnvironmentAware接口");
    }

    public void setName(String name) {
        System.out.println("设置对象属性");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void initMethod() {
        System.out.println("执行自定义init-method方法");
    }


    private void destroyMethod() {
		System.out.println("执行destroy方法");
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用了afterPropertiesSet");
	}

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable.destroy");
    }
}
