package pcy.InstantiationAwareBeanPostProcessor;

import pcy.InstantiationAwareBeanPostProcessor.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		A a = (A) context.getBean("a");
		System.out.println(a);
	}
}
