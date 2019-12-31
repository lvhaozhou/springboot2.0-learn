package com.lhz.dive2inspringboot.bootstrap;

import com.lhz.dive2inspringboot.repository.MyFirstLeveRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 16:10
 * @Description: 仓储引导类
 * @Version: 1.0
 */
@ComponentScan("com.lhz.dive2inspringboot.repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE).run(args);
        //派生性
        MyFirstLeveRepository fist = context.getBean("myFirstLeveRepository", MyFirstLeveRepository.class);
        System.out.println("myFirstLeveRepository :" + fist.toString());
        //关闭上下文
        context.close();
    }
}
