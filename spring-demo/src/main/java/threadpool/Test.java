package threadpool;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import threadpool.service.MyService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/4/13 19:30
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService bean = context.getBean(MyService.class);
        bean.hello("yuege");
        bean.hello(null);
//        Future future = bean.hello1("悦哥");
//        Future future1 = bean.hello1(null);
//        System.out.println(future.get());
//        System.out.println(future1.get());
    }
}
