package com.example.Lab8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Lab8.UserBase;
import com.example.Lab8.User;
 
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
        HttpServletRequest request, 
        HttpServletResponse response) 
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = new User(login, password);
        UserBase.getInstance().add(user);
        response.sendRedirect(request.getContextPath() + "/index.html");
    }
}