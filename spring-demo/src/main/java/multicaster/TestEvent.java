package multicaster;

import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/24 15:49
 */
public class TestEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public TestEvent(Object source) {
        super(source);
    }
    public String msg;

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
    public void print(){
        System.out.println(msg);
    }
}
