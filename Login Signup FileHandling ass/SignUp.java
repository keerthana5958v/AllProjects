import java.io.FileWriter;
import java.util.Scanner;


public class SignUp {
    public static void main(String[] args) {
        SignUp obj = new SignUp();
        obj.setUserName(obj.getUserName());
        obj.setPassword(obj.getPassword());
        obj.fileWriting();
    }
    String userName = "";
    String password = "";
    String getUserName(){
        Scanner usrN = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = usrN.nextLine();
        usrN.close();
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword(){
        PasswordChecker checker = new PasswordChecker();
        int maxTries = 5;
        int myTries = 0;
        String password = null;
        while(myTries < maxTries){
            String userInput = checker.getInput();
            if(checker.identifyStrength(userInput)){
                password = userInput;
                break;
            }
            else{
                System.out.println("--enter again--");
                myTries++;
            }
        }
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // public String toString(){
    //     return  getUserName() + "\t" + getPassword();
    // }

    public void fileWriting(){

        try{
            FileWriter fw = new FileWriter("/home/keerthanas/IdeaProjects/Login Signup FileHandling ass/src/UsernameContainer.txt");
            fw.write(getUserName() + " " + getPassword());
            fw.close();
        }
        catch(Exception e){
            System.out.println("cannot write to file \n\n\n" + e.getMessage());
        }

    }

}
