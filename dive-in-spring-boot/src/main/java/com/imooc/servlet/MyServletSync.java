package com.imooc.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: dive-in-spring-boot
 * @Package: com.imooc.servlet
 * @ClassName: MyServletSync
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-07-12 16:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@WebServlet(urlPatterns = "/my/servletsync",asyncSupported = true)
public class MyServletSync extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext=req.startAsync();

        asyncContext.start(()->{
            try {
                resp.getWriter().println("Hello World");
                asyncContext.complete();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

    }
}
