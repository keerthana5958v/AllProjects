package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

public class LoginServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = request.getParameter("userName");
        response.getWriter().append("Served At: ").append(request.getContextPath());
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Login login = new Login();
        boolean res = login.loginAccount(userName, password);
        if (res){
            response.getWriter().append("User Successfully Logged in");
        }
        else{
            response.getWriter().append("Account Unavailable");
        }
    }

}
