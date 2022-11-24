package com.example.web.request;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo7")
public class Servlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        System.out.println("username: " + username);
        System.out.println("password: " + password);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);

    }
}
