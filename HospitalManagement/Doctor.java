package org.example;

import java.sql.*;
import java.util.Scanner;

public class Doctor extends Details{
    public Doctor(){}
    void getDoctorName(){
        System.out.println("enter doctor's name: ");
        Scanner sc = new Scanner(System.in);
        setName(sc.nextLine());
    }

    void updateAvailability(String name, boolean isAvailable){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "username","password")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = connection.createStatement();
            String query = "UPDATE doctor " + " SET isAvailable = "  + isAvailable+ " WHERE name = "+ name +";";
            statement.executeUpdate(query);
        }
        catch (Exception e){}
    }
    void getAllAvailableDoctors(){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "username","password")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "select * from doctor where isAvailable = TRUE";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            int count = 0;
            while(resultSet.next()){
                count++;
                System.out.println(count + ". "+resultSet.getString(1));
            }
            if(!resultSet.next()) System.out.println("no available doctor");
        }
        catch (Exception e){}
    }
}

///////// yet to do --> delete account , //check no of patient // check all available doctors


