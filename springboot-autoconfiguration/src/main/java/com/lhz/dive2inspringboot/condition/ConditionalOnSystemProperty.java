package com.lhz.dive2inspringboot.condition;

import org.springframework.context.annotation.Conditional;

import javax.naming.Name;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 17:47
 * @Description: java 系统属性条件判断
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({OnSystemPropertyCondition.class})
public @interface ConditionalOnSystemProperty {
    /**
     * java 系统名称
     * @return
     */
    String name();

    /**
     * java系统属性值
     * @return
     */
    String value();
}
