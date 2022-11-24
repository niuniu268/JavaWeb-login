package com.example.web.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

@WebServlet("/demo4")
public class ServletResp1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.write("<h1> test <h1>");*/

        ServletOutputStream stream = resp.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream("/Users/Mac/IdeaProjects/Screenshot.png");
        FileOutputStream outputStream = new FileOutputStream("/Users/Mac/Downloads/screen1.png");
        byte[] group = new byte[1024];
        int len;
        while((len= fileInputStream.read(group)) != -1){
            stream.write(group,0,len);
            outputStream.write(group,0,len);
        }
        outputStream.close();


//        resp.sendRedirect("/MavenDemo_war/demo5");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
