package com.example.Lab8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }
}