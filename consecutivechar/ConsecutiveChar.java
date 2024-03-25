import java.util.Scanner;
public class ConsecutiveChar{
    String input;
    String temp="";
    String output="";
    public static void main(String[] args) {
        ConsecutiveChar obj = new ConsecutiveChar();
        obj.getInput();
        obj.checkConsecutiveCharacter();
    }
    public void getInput(){
        Scanner getString = new Scanner(System.in);
        System.out.println("enter string  ");
        input = getString.nextLine();
    }
    public void checkConsecutiveCharacter(){
        for (int i=0; i<input.length()-1;i++){
            if(input.charAt(i) == input.charAt(i+1)){
                output+= (temp + input.charAt(i) + input.charAt(i));
            }
        }
        System.out.println(output);
    }
}