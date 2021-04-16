package threadpool.service;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureTask;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/4/13 19:56
 */
@Service
public class MyServiceImpl implements MyService {
    @Override
    public void hello(String name) {
        if (name == null) {
            throw new RuntimeException("name cannot be null");
        }
        System.out.println("hello " + name);
    }

    @Override
    public ListenableFuture<String> hello1(String name) {
        if (name == null) {
            throw new RuntimeException("name cannot be null");
        }
        return new AsyncResult<>("hello " + name);
    }
}
