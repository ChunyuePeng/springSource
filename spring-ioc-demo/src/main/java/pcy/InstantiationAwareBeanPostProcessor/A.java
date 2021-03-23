package pcy.InstantiationAwareBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
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
public class A implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, EnvironmentAware,
        EmbeddedValueResolverAware, ApplicationContextAware {
	public A() {
		System.out.println("A被实例化");
	}

//	private com.com.pcy.InstantiationAwareBeanPostProcessor.B b;
    private String name;

//    public com.com.pcy.InstantiationAwareBeanPostProcessor.B getB() {
//        return b;
//    }
//
//    public void setB(com.com.pcy.InstantiationAwareBeanPostProcessor.B b) {
//        this.b = b;
//    }

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
		System.out.println("设置"+name);
    	this.name = name;
	}

	public String getName() {
		return name;
	}
	public void initMethod(){
		System.out.println("初始化");
	}
}
