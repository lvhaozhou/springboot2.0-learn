package com.lhz.diveinspringboot.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 16:57
 * @Description: 监听 BeforeConfigFileApplicationListener
 * @Version: 1.0
 */
public class BeforeConfigFileApplicationListener implements SmartApplicationListener ,Ordered {


    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(aClass) || ApplicationPreparedEvent.class.isAssignableFrom(aClass);
    }

    @Override
    public int getOrder() {
        //比ConfigFileApplicationListener 有先见更高
        return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent pre = (ApplicationEnvironmentPreparedEvent) applicationEvent;
            ConfigurableEnvironment environment = pre.getEnvironment();
            System.out.println("environment.getProperty name :" + environment.getProperty("name"));
        }

        if (applicationEvent instanceof ApplicationPreparedEvent) {
        }
    }
}
