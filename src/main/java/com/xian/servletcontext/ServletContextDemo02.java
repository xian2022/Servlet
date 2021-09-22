package com.xian.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Xian
 */
@WebServlet("/scd2")
public class ServletContextDemo02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletContext功能
        //1. 获取MIME类型：
        //  MIME类型：在互联网通信过程中定义的一种文件数据类型
        //          格式：大类型/小类型        text/html         image/jpeg
        //          获取：String getMimeType(String file)
        //2. 域对象：共享数据的
        //3. 获取文件的真实（服务器路径）路径
        //通过HttpServlet获取
        ServletContext context = this.getServletContext();
        //定义一个文件名称
        String filename = "a.jpg";
        //获取MIME类型
        System.out.println(context.getMimeType(filename));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
