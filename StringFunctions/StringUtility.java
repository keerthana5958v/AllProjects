import java.util.Scanner;

public class StringUtility {
    String input="";
    public static void main(String[] args) {
        StringUtility object = new StringUtility();
        object.giveIntroduction();
        object.getInput();
        System.out.println("\ncharacter count -->  "+object.countCharacters());
        System.out.println("word count -->  "+object.countWords());
        System.out.println("line Count -->  "+object.countLines());
        System.out.println("checking whether string contains 'a' -->  "+object.containsCharacter()+"\n");
        System.out.println("upper case -->  \n"+object.toUpperCase());
        System.out.println("lower case -->  \n"+object.toLowerCase());
        System.out.println("toggled case -->  \n"+object.toToggleCase());
    }
    public void giveIntroduction(){
        System.out.println("this is a program to do the following activities to your input\n1. count the number of lines and words in your paragraph\n2. check if it contains 'a'\n3. convert to upper case, lower case and toggle case");
        Scanner scan = new Scanner(System.in);
            System.out.println("press enter to continue...");
            String enter = scan.nextLine();
            while(enter == "\n"){
                break;
            }
    }
    public String getInput() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("enter your paragraph, enter \"bye\" to exit");

        while (true) {
            String inputInEachLine = scanObj.nextLine();
            if (inputInEachLine.equals("bye")) {
                break;
            }
            input += inputInEachLine + "\n";
        }
        return input;
    }

    public int countCharacters(){
        return input.length();
    }
    public int countWords(){
        int wordCount=0;
        for(int a=0; a<input.length();a++){
            if (input.charAt(a)==' '){
                wordCount++;
            }
            if (input.charAt(a)=='\n'){
                wordCount++;
            }
        }
        return wordCount;
    }

    public int countLines() {
        int lineCount=0;
        for (int i = 1; i<input.length();i++){
            if (input.charAt(i)=='\n'){
                lineCount++;
            }
        }
        return lineCount;
    }

    public boolean containsCharacter(){
        return input.contains("a");
    }
    public String toUpperCase(){
        return input.toUpperCase();
    }
    public String toLowerCase(){
        return input.toLowerCase();
    }
    public String toToggleCase(){
        String toggledString = "";
        for(int j=0; j<input.length(); j++){
            char letter = input.charAt(j);
            if(Character.isUpperCase(input.charAt(j))) {
                letter = Character.toLowerCase(letter);
                toggledString = toggledString + letter;
            }
            else if(Character.isLowerCase(input.charAt(j))) {
                letter = Character.toUpperCase(letter);
                toggledString = toggledString + letter;
            }
            else if (Character.isDigit(letter)) {
                toggledString = toggledString + letter;
            }
            else if (input.charAt(j)=='\n') {
                toggledString = toggledString + '\n';
            }
            else if (input.charAt(j)==' ') {
                toggledString = toggledString + ' ';
            }
        }
        return toggledString;
    }
}