package com.lhz.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: lhz
 * @Date: 2019/12/28 0028 21:17
 * @Description: SpringBootWebMvcBootstrap 引导类
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.lhz.web")//默认扫描启动类当前包 和 子包
public class SpringBootWebMvcBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class, args);
    }
}
