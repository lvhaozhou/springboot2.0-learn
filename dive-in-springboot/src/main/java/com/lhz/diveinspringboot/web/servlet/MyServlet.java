package com.lhz.diveinspringboot.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: lhz
 * @Date: 2019/12/22 0022 19:17
 * @Description: myServlet
 * @Version: 1.0
 */
@WebServlet(urlPatterns = "/my/servlet", asyncSupported = true)
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(
            () ->{
                try {
                    resp.getWriter().println("hello world");
                    //触发完成
                    asyncContext.complete();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        );
    }
}
