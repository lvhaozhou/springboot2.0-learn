package com.lhz.dive2inspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 16:54
 * @Description: hello world配置类
 * @Version: 1.0
 */
@Configuration
public class HelloWorldConfiguration {
    @Bean("helloworld")
    public String helloworld() {
        return "Hello world 2019";
    }
}
