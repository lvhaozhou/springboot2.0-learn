package com.lhz.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 14:34
 * @Description: helloworld 上下文
 * @Version: 1.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldInitializer <C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {

    @Override
    public void initialize(C applicationContext) {
        System.out.println("ConfigurableApplicationContext.id :" +  applicationContext.getId());
    }
}
