package com.lhz.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: lhz
 * @Date: 2019/12/30 0030 13:50
 * @Description: SpringBootViewBootstrap 视图引导类
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.lhz.web")
public class SpringBootViewBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootViewBootstrap.class, args);
    }
}
