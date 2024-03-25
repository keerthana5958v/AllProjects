package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SignUp{
    public static void main(String[] args) {
        SignUp obj = new SignUp();
        obj.newDoctor("keerthana","password", true);
    }
    void newDoctor(String name, String password , boolean isAvailable){
        Connection connection;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "username","password");
            Statement statement = connection.createStatement();
            String query = "INSERT INTO doctor (name, password , isAvailable) VALUES ('" + name + "','" + password + "','"+isAvailable+"');";
            statement.executeUpdate(query);
            System.out.println("successfully signed up");
        }
        catch (Exception e){
            System.out.println("catch");
            e.printStackTrace();
        }
    }
    void newPatient(String name, String password , String concern, int appointmentTime){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "username","password")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = connection.createStatement();
            String query = "INSERT INTO patient (name, password , concern , appointmentTime) VALUES ('" + name + "','" + password + "','"+concern+"','"+appointmentTime+"');";
            statement.executeUpdate(query);
            System.out.println("successfully signed up");
        }
        catch (Exception e){}
    }
}
