package org.example;

import java.sql.ResultSet;

public class SignUp {
    private final DBConnection dbConnection= new DBConnection();
    public boolean signUp(String name, String password){
        String query = "SELECT * FROM accounts WHERE username LIKE '"+name+"';";
        try(ResultSet resultSet = dbConnection.fetchValueFromDB(query)) {
            if (!resultSet.next()) {
                    String insertQuery = "INSERT INTO accounts(username, password) VALUES ('"+name+"', '"+password+"');";
                    dbConnection.executeQuery(insertQuery);
                    return true;
            }
            else {
                return false;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}
