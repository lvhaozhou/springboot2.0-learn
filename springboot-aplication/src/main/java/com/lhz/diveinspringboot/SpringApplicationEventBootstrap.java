package com.lhz.diveinspringboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 16:20
 * @Description: spring应用事件引导类
 * @Version: 1.0
 */
public class SpringApplicationEventBootstrap {
    //spring framework 的实现方式
    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册应用监听器
        context.addApplicationListener(applicationEvent -> {
            System.out.println("监听到事件 ：" + applicationEvent);
        });

        //启动
        context.refresh();

        context.publishEvent("helloWord");
        context.publishEvent("helloWord");

        //关闭
        context.close();
    }
}
