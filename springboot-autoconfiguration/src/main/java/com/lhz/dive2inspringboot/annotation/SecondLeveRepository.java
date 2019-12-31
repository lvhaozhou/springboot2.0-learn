package com.lhz.dive2inspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 16:19
 * @Description: 二级 Repository
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLeveRepository
public @interface SecondLeveRepository {
    String value() default "";
}
