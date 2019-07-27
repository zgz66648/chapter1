package com.example.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ageServlet")
public class AgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        String str ="{\"age\":\"HaHa先生\",\"age\":\"18岁啦\"}";
        out.println(str);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("This is the editor10.");
        System.out.println("This is the editor11.");
        System.out.println("This is the editor12.");
        System.out.println("This is the editor13.");
        System.out.println("This is the editor14.");
        System.out.println("This is the editor15.");
        System.out.println("This is the editor16.");
    }
}
