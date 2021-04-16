package pcy.InstantiationAwareBeanPostProcessor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/22 13:30
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	/**
	 * InstantiationAwareBeanPostProcessor中自定义的方法
	 * 在方法实例化之前执行  Bean对象还没有
	 *
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName  the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(">>postProcessBeforeInstantiation");
		//利用cglib动态代理生成对象返回
		if (beanClass == B.class) {
			Enhancer e = new Enhancer();
			e.setSuperclass(beanClass);
			e.setCallback(new MethodInterceptor() {
				@Override
				public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
					System.out.println("目标方法执行前：" + method);
					Object o1 = methodProxy.invokeSuper(o, objects);
					System.out.println("目标方法执行后：" + method);
					return o1;
				}
			});
			B b = (B) e.create();
			return b;
		}
		return null;
	}

	/**
	 * InstantiationAwareBeanPostProcessor中自定义的方法
	 * 在方法实例化之后执行  Bean对象已经创建出来了
	 *
	 * @param bean     the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("<<postProcessAfterInstantiation");
		return true;
	}

	/**
	 * InstantiationAwareBeanPostProcessor中自定义的方法，可以用来修改bean中的属性内容
	 *
	 * @param pvs      the property values that the factory is about to apply (never {@code null})
	 * @param bean     the bean instance created, but whose properties have not yet been set
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("<---postProcessPropertyValues--->");
		if (bean instanceof MyBean){
			PropertyValue value = pvs.getPropertyValue("name");
			System.out.println("修改前name的值是:"+value.getValue());
			value.setConvertedValue("yuegege");
		}
		return pvs;
	}

	/**
	 * BeanPostProcessor接口中的方法，在bean的自定义方法之前执行。
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(">>postProcessBeforeInitialization");
		return bean;
	}

	/**
	 * BeanPostProcessor接口中的方法，在bean的自定义方法之后执行。
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("<<postProcessAfterInitialization");
		return bean;
	}
}
