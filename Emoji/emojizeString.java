import java.util.Scanner;
public class emojizeString{
    String emojiName="";
    public static void main(String[] args) {
        emojizeString obj = new emojizeString();
        obj.getInput();
        obj.identifyEmoji();
    }
    public void getInput(){  //get input
        Scanner obj = new Scanner(System.in);
        System.out.println("enter name of emoji");
        emojiName = obj.nextLine();
    }

    public void splitColon(){
        emojiName.split(":");
    }
    public void identifyEmoji(){ //identifyEmoji
        if (emojiName.equals("thumbsup")) {
            System.out.println("\ud83d\udc4d");
        }
        else if (emojiName.equals("thumbsdown")) {
            System.out.println("\ud83d\udc4e");
        }
        else if (emojiName.equals("smile")) {
            System.out.println("\ud83d\ude01");
        }
        else if (emojiName.equals("bomb")) {
            System.out.println("\ud83d\udca3");
        }
        else if (emojiName.equals("alien")) {
            System.out.println("\ud83d\udc7e");
        }
        else{
            System.out.println("<----- enter valid input ------>");
        }
    }
}