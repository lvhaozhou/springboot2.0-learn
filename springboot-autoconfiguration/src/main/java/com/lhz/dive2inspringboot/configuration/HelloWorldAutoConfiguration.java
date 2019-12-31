package com.lhz.dive2inspringboot.configuration;

import com.lhz.dive2inspringboot.annotation.EnableHelloWord;
import com.lhz.dive2inspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 19:33
 * @Description: helloworld自动装配实现
 * @Version: 1.0
 */
@Configuration//spring模式注解
@EnableHelloWord//enable模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "Administrator")//条件装配
public class HelloWorldAutoConfiguration {
}
