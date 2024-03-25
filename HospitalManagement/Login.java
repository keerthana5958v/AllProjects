package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login{
    public boolean getDoctorLogin() {
        return isDoctorLogin;
    }
    public void setDoctorLogin(boolean doctorLogin) {
        isDoctorLogin = doctorLogin;
    }
    //    select * from table where name  = "" and password like"";
    private boolean isDoctorLogin = false;

    public boolean getPatientLogin() {
        return isPatientLogin;
    }
    public void setPatientLogin(boolean patientLogin) {
        isPatientLogin = patientLogin;
    }
    private boolean isPatientLogin = false;
    void loginDoctor(String name, String password) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "username","password")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "SELECT * FROM doctor WHERE name like "+name+" and password like "+password;
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                System.out.println("Account not found. Try Signing up instead");
            }
            else{
                System.out.println("logged in as "+ name);
                setDoctorLogin(true);
            }
        }catch (Exception e){}
    }
    void loginPatient(String name , String password){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "username","password")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "SELECT * FROM patient WHERE name like "+name+" and password like "+password;
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                System.out.println("Account not found. Try Signing up instead");
            }
            else{
                System.out.println("logged in as "+ name);
                setPatientLogin(true);
            }
        }catch (Exception e){}
    }
}

