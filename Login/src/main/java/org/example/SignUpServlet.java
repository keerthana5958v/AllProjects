package org.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@MultipartConfig
//@WebServlet(asyncSupported = true, urlPatterns = {"/SignUpServlet"})

public class SignUpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = request.getParameter("userName");
        response.getWriter().append("Served At: ").append(request.getContextPath());
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        SignUp signUp = new SignUp();
        boolean res = signUp.signUp(userName, password);
        if (res){
            response.getWriter().append("User Successfully Created");
        }
        else{
            response.getWriter().append("Unique Username Required");
        }
    }
}
