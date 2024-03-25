package org.example;

import java.sql.*;

public class DBConnection {

    public static void main(String[] args){
        DBConnection obj = new DBConnection();
        obj.viewTable();
    }
    public void writeToDB(String name , String number){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation", "keerthana","myPassword");
            Statement statement = connection.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "INSERT INTO student (name, number) VALUES ('" + name + "','" + number + "');";
            statement.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            }
            catch (Exception ee){
                System.out.println(ee.getMessage());
            }
        }
    }
    void viewTable(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation", "keerthana","myPassword");) {
            Statement statement = connection.createStatement();
            try (ResultSet resultSet = statement.executeQuery("select * from student")) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1) + " , " + resultSet.getString(2));
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
