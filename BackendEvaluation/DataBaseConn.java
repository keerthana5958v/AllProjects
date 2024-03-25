package org.example;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

//        Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hobby", "root","Zohoschools#2023");
//        Statement statementObj = connectionObj.createStatement();
//        ResultSet rs = statementObj.executeQuery("show databases;");
    }
}

