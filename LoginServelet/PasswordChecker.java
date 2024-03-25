import java.util.Scanner;

public class PasswordChecker {
    public String getValidPassword(){
        String password;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your password-->\t");
            password  = sc.nextLine();
        }
        while (!identifyStrength(password));
        return password;
    }
    private boolean identifyStrength(String givenPassword){
        String specialCharacters = "!@#$%^&*()><,./?";
        boolean containsSpecialCharacter = false;
        boolean containsUppercase = false;
        boolean containsDigit = false;
        if(givenPassword.length()>=8) {
            for (int i = 0; i < givenPassword.length(); i++) {
                char c = givenPassword.charAt(i);
                if (specialCharacters.contains(String.valueOf(c))) {
                    containsSpecialCharacter = true;
                }
                else if (Character.isUpperCase(c)) {
                    containsUppercase = true;
                }

                else if (Character.isDigit(c)) {
                    containsDigit = true;
                }
            }
            return (containsUppercase && containsDigit && containsSpecialCharacter);
        }
        return false;
    }

}