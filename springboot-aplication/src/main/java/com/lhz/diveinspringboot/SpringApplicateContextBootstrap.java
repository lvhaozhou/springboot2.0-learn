package com.lhz.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 17:24
 * @Description: spring 应用上下文引导类
 * @Version: 1.0
 */
@SpringBootApplication
public class SpringApplicateContextBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicateContextBootstrap.class)
                .web(WebApplicationType.NONE).run(args);

        System.out.println("context 类型:" + context.getClass().getName());

        context.close();
    }
}
