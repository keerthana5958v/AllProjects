import java.util.Objects;

public class DailyQuestions {
    public boolean containsWhiteSpace(String str){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' '){
                return true;
            }
        }
        return false;
    }
    public boolean containsSpecialCharacters(String str){
        String specialChars = "!@#$%^&*()";
        for(int i = 0 ; i < str.length() ; i++) {
            if(specialChars.contains(str.charAt(i)+"")){
                return true;
            }
        }
        return false;
    }
    public boolean containsLeadingSpace(String str){
        return str.charAt(0) == ' ';
    }
    public boolean containsEndingSpace(String str){
        return str.charAt(str.length()-1) == ' ';
    }
    public boolean isNull(String str){
        return str==null;
    }
    public boolean isEmpty(String str){
        return Objects.equals(str, "");
    }
}