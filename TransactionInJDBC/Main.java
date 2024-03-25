package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hobby", "keerthana","myPassword");

    }
}