package com.lhz.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 15:35
 * @Description: AfterHelloWorldApplicationListener
 * @Version: 1.0
 */
@Order(Ordered.LOWEST_PRECEDENCE)
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("after hello word:" + contextRefreshedEvent.getApplicationContext().getId() +
                ", timestamp:" + contextRefreshedEvent.getTimestamp());
    }
}
