package threadpool.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/4/13 19:55
 */
@Async
public interface MyService {
    void hello(String name);
    ListenableFuture<String> hello1(String name);
}
