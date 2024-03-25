import java.sql.ResultSet;

public class SignUp{
    private final DBConnection dbConnection = new DBConnection();
    public boolean userSignUp(String name , String password){
        PasswordChecker ps = new PasswordChecker();
        String query = "select * from accounts where username = '"+ name +"';";
        try (ResultSet resultSet = dbConnection.fetchValueFromDB(query)){
            if(resultSet.next()){
                System.out.println("account already exist");
                return true;
            }
            else {
                query = "INSERT INTO accounts (username, password) VALUES ('" + name + "', '" + password + "')";
                dbConnection.executeQuery(query);
                System.out.println("successfully signed up");
            }
        }
        catch (Exception e){System.out.println(e.getMessage());}
        return false;
    }

}
