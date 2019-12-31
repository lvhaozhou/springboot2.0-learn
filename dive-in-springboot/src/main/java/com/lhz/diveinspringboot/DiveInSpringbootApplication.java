package com.lhz.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.lhz.diveinspringboot.web.servlet")
public class DiveInSpringbootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DiveInSpringbootApplication.class).//web()
        run(args);
        //SpringApplication.run(DiveInSpringbootApplication.class, args);
    }

}
