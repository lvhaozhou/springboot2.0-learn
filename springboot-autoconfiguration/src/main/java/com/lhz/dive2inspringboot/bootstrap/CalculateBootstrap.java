package com.lhz.dive2inspringboot.bootstrap;

import com.lhz.dive2inspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 17:31
 * @Description: 算法引导类
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.lhz.dive2inspringboot.service")
public class CalculateBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateBootstrap.class)
                .web(WebApplicationType.NONE).profiles("Java8").run(args);
        //派生性
        CalculateService service = context.getBean(CalculateService.class);
        System.out.println("1-5求和 :" + service.sum(1,2,3,4,5));
        //关闭上下文
        context.close();
    }
}
