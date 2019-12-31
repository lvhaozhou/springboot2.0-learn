package com.lhz.web.template.engine;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: lhz
 * @Date: 2019/12/30 0030 10:06
 * @Description: TheymeleafTemplateEngineBootstrap 引导类
 * @Version: 1.0
 */
public class TheymeleafTemplateEngineBootstrap {
    public static void main(String[] args) throws IOException {
        //构建引擎
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        //创建渲染上下文
        Context context = new Context();
        context.setVariable("message", "hello world");

        //读取资源从： classpath:/templates/theymeleaf/hello-world.html
        //ResourceLoader
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/templates/theymeleaf/hello-world.html");
        File templateFile = resource.getFile();
        //流读取
        FileInputStream in = new FileInputStream(templateFile);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //copy
        IOUtils.copy(in , out);
        in.close();

        //模板内容
        String content = out.toString("UTF-8");
        //String content = "<p th:text=\"${message}\">!!!</p>";
        //渲染处理结果
        String result = springTemplateEngine.process(content, context);
        //输出渲染处理结果
        System.out.println(result);

    }
}
