import java.util.Scanner;

public class PasswordChecker {
    String givenPassword;

    public static void main(String[] args) {
        PasswordChecker obj = new PasswordChecker();
        System.out.println(obj.giveIntroduction());

        obj.getInput();
        obj.identifyStrength();
    }
    public String giveIntroduction(){
        String introduction = "This is a program to identify the strength of a password\nEnter a password to identify its strength :)";
        return introduction;
    }
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a password-->");
        givenPassword = scan.nextLine();
    }
    public boolean isValidLength(){
        if(givenPassword.length()>8){
            return true;
        }
        return false;
    }
     public boolean hasSpecialCharacters(){
         for(int i =0; i < givenPassword.length() ; i++ ){
             if(givenPassword.charAt(i)== '!' || givenPassword.charAt(i)== '@' || givenPassword.charAt(i)== '#' || givenPassword.charAt(i)== '$' || givenPassword.charAt(i)== '%' || givenPassword.charAt(i)== '&' || givenPassword.charAt(i)== '*'){
                return true;
             }
         }
         return false;
     }

    public boolean hasDigit(){
        for (int i = 0; i < givenPassword.length(); i++) {
            char c = givenPassword.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public boolean hasUpperCase(){
        for(int k=0; k< givenPassword.length() ; k++){
            char a = givenPassword.charAt(k);
            if(Character.isUpperCase(a)){
                return true;
            }
        }
        return false;
    }
    public void identifyStrength(){
        if(isValidLength()==true){
            if(hasSpecialCharacters() && hasDigit() && hasUpperCase()){
                System.out.println("it is an eligible password :)");
            }
            else {
                System.out.println("It is a weak password :(");
            }
        }
        else{
            System.out.println("Password must contain minimum 8 characters");
        }
    }
}