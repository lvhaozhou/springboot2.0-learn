package com.lhz.dive2inspringboot.annotation;

import com.lhz.dive2inspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 16:45
 * @Description: Hello world实现
 * @Version: 1.0
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
