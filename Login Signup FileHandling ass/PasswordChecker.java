import java.util.Scanner;

public class PasswordChecker {
    String password;

    public static void main(String[] args) {
        PasswordChecker obj = new PasswordChecker();
        obj.setGivenPassword(obj.getInput());
        obj.identifyStrength(obj.password);
    }
    public String getInput(){
        Scanner pswd = new Scanner(System.in);
        System.out.print("Enter your password: ");
        this.password = pswd.nextLine();
        return  password;
    }

    public void setGivenPassword(String password) {
        this.password = password;
    }

    public boolean isValidLength(String p){
        if(p.length()>7){
            return true;
        }
        return false;
    }
    public boolean hasSpecialCharacters(String p){
        for(int i =0; i < p.length() ; i++ ){
            if(p.charAt(i)== '!' || p.charAt(i)== '@' || p.charAt(i)== '#' || p.charAt(i)== '$' || p.charAt(i)== '%' || p.charAt(i)== '&' || p.charAt(i)== '*'){
                return true;
            }
        }
        return false;
    }
    public boolean hasDigit(String p){
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public boolean hasUpperCase(String p){
        for(int k=0; k< p.length() ; k++){
            char a = p.charAt(k);
            if(Character.isUpperCase(a)){
                return true;
            }
        }
        return false;
    }

    public boolean identifyStrength(String p){
        if(!isValidLength(p)){
            System.out.println("Password must contain minimum of 8 characters");
            return false;
        }
        if(!hasSpecialCharacters(p)){
            System.out.println("password must contain special characters");
            return false;
        }
        if (!hasDigit(p)){
            System.out.println("your password must contain a digit");
            return false;
        }
        if (!hasUpperCase(p)){
            System.out.println("password must contain upper case letters");
        }
        boolean isStrongPassword = isValidLength(p) && hasSpecialCharacters(p) && hasDigit(p) && hasUpperCase(p);
        return isStrongPassword;
    }

}