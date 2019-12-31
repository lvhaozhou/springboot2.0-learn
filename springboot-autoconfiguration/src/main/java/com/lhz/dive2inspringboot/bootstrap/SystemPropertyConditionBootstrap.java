package com.lhz.dive2inspringboot.bootstrap;

import com.lhz.dive2inspringboot.condition.ConditionalOnSystemProperty;
import com.lhz.dive2inspringboot.repository.MyFirstLeveRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 18:02
 * @Description: 系统属性条件引导类
 * @Version: 1.0
 */

public class SystemPropertyConditionBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "Administrator")
    public String helloWorld() {
        return "helloWorld lhz";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SystemPropertyConditionBootstrap.class)
                .web(WebApplicationType.NONE).run(args);
        String hello = context.getBean("helloWorld", String.class);
        System.out.println("hello :" + hello);
        //关闭上下文
        context.close();
    }
}
