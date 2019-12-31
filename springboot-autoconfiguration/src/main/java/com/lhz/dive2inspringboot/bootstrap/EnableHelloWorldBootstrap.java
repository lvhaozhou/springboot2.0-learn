package com.lhz.dive2inspringboot.bootstrap;

import com.lhz.dive2inspringboot.annotation.EnableHelloWord;
import com.lhz.dive2inspringboot.repository.MyFirstLeveRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 16:58
 * @Description: 模块装配引导类
 * @Version: 1.0
 */
@EnableHelloWord
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE).run(args);
        //派生性
        String hello = context.getBean("helloworld", String.class);
        System.out.println("hello :" + hello);
        //关闭上下文
        context.close();
    }
}
