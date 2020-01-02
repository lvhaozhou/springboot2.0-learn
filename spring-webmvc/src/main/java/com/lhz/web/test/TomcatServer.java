package com.lhz.web.test;


import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * @Auther: lhz
 * @Date: 2019/12/31 0031 16:22
 * @Description: SpringApplication
 * @Version: 1.0
 */
public class TomcatServer {
    public static void main(String[] args) throws LifecycleException {
            EmbbedTomcat.main(args);
    }
}
