import java.util.Scanner;

public class FindNumberOfChar {
    String name;

    public String introduction(){
        return "this is a program to count the number of 'e' in a given string";
    }
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        name = scan.nextLine();
    }
    public void calculateNumberOfCharacter() {

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("total number of 'e' in the word: " + count);
    }
    public static void main(String[] args){
        FindNumberOfChar obj = new FindNumberOfChar();
        System.out.println(obj.introduction());
        obj.getInput();
        obj.calculateNumberOfCharacter();
    }
}