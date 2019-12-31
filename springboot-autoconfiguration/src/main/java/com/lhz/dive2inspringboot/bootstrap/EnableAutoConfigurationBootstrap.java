package com.lhz.dive2inspringboot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 19:30
 * @Description: autoConfiguration引导类
 * @Version: 1.0
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE).run(args);

        String hello = context.getBean("helloworld", String.class);
        System.out.println("hello :" + hello);

        //关闭上下文
        context.close();
    }

}
