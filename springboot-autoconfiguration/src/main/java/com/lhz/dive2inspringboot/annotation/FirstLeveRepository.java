package com.lhz.dive2inspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 15:47
 * @Description: 一级注解类
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLeveRepository {
    String value() default "";
}
