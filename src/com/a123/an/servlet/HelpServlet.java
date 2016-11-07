package com.a123.an.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: lovegod
 * Created by 123 on 2016/11/7.
 */
@WebServlet(name = "HelpServlet",urlPatterns = {"/help"})
public class HelpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       data(request,response);
    }

    private void data(HttpServletRequest request, HttpServletResponse response) {
        //数据库查询
        int version=0;
        try {
            version = Integer.parseInt(request.getParameter("Version"));
        }catch (Exception e){
            e.printStackTrace();
        }
        //数据库操作

    }




}
