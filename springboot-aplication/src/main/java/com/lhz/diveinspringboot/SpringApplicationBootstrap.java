package com.lhz.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 11:10
 * @Description: springApplication 引导类
 * @Version: 1.0
 */
public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        Set<String> source = new HashSet<>();
        //配置class 名称
        source.add(SpringApplicationConfiguration.class.getName());
        SpringApplication application = new SpringApplication();
        application.setSources(source);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
        //SpringApplication.run(SpringApplicationConfiguration.class, args);
    }

    @SpringBootApplication
    public static class SpringApplicationConfiguration {

    }
}
