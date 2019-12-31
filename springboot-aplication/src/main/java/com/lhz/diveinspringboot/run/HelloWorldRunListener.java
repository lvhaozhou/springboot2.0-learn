package com.lhz.diveinspringboot.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.event.ApplicationStartingEvent;

/**
 * @Auther: lhz
 * @Date: 2019/12/25 0025 16:39
 * @Description: SpringApplicationRunListener
 * @Version: 1.0
 */
public class HelloWorldRunListener implements SpringApplicationRunListener {
    public HelloWorldRunListener(SpringApplication application, String[] args){

    }

    public void starting() {
        System.out.println("HelloWorldRunListener starting......");
    }

}
