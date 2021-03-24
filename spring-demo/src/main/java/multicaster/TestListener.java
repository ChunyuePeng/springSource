package multicaster;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 15:51
 */
public class TestListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof TestEvent){
            TestEvent event1 = (TestEvent) event;
            event1.print();
        }
    }
}
