package com.lhz.web.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;


/**
 * @Auther: lhz
 * @Date: 2019/12/27 0027 10:11
 * @Description: spring webMvc配置类
 * @Version: 1.0
 */

@Configuration
//@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    /*<bean id="viewResolver"
        class="org.springframework.web.servlet.view.InternalResourceViewResolver">
            <property name="viewClass" value="org.springframework.web.servlet.view.JstlView" />
            <property name="order" value="1" />
                &lt;!&ndash; 前缀 &ndash;&gt;
            <property name="prefix" value="/WEB-INF/jsp/" />
                &lt;!&ndash; 后缀 &ndash;&gt;
            <property name="suffix" value=".jsp" />
        </bean>-->*//*


    */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        //thymeleaf 的优先级的 最低优先级－5
        //调整优先级
        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 10);
        return viewResolver;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("拦截中。。。。。");
                return true;
            }
        });
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true).favorPathExtension(true);
    }

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer(){
        return (factory) -> {
            factory.addContextCustomizers((context) -> {
                String relativePath = "springboot-view/src/main/webapp";
                File docBase = new File(relativePath);
                if (docBase.exists()) {
                    //解决maven 多模块路径无法读取问题
                    context.setDocBase(docBase.getAbsolutePath());
                }
            });
        };
    }
}

