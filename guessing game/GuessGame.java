import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    //declare variables
    int randomNumber = 0;
    int userInputNum = 0;
    int noOfGuesses = 1;
    public static void main(String[]args){
        GuessGame obj = new GuessGame();
        System.out.println(obj.giveIntroduction());
        obj.setRandomNumber();
        obj.getInput();
        obj.checkCondition();
    }
    //giving introduction about game to user
    public String giveIntroduction(){
        return "\nThis is a guessing game. Guess a random number between 0 & 10\n *  Keep trying till you get it right  *\n ";

    }
    // make a random number
    public void setRandomNumber(){
        Random randnum = new Random();
        randomNumber= randnum.nextInt(10);
    }

    // get input
    public void getInput(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number between 0 - 10");
    userInputNum = scan.nextInt();
    }

    // check condition
    public void checkCondition(){
        boolean temp = true;
        while(temp==true){
            if(randomNumber!=userInputNum){
                ifWrong();
                getInput();
                noOfGuesses++;
            }
            else {
                ifCorrect();
                break;
            }
        }

    }

    //if correct
    public void ifCorrect(){
        System.out.println("you guessed it right :)");
        System.out.println("no of guesses is -->"+ noOfGuesses);
    }

    //if wrong guess
    public void ifWrong(){
        System.out.println("Go ahead\ttry again :(\n ");
    }
}
