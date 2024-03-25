import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    int randomNum = 4;
    int guessedNum = 0;
    public static void main(String[]args){
        GuessingGame obj = new GuessingGame();
        obj.processing();
    }
    //to get random input from the user
    public void getGuessedInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a random number between 1 - 10");
        guessedNum = scan.nextInt();
    }
    // if guessedNum == random num
    public boolean checkCondition(){
        if (randomNum==guessedNum){
            return true;
        }
        return false;
    }
    public void processing(){
        while(true){
            getGuessedInput();
            if(checkCondition()){
                System.out.println("your guess is correct");
                break;
            }

        }
        System.out.println("you win the game !!!");
    }
}





//public class NumberGuess {
//
//
//
//
//
//    public  static void main(String args[]) {
//
//
//
//        Scanner keyboard = new Scanner(System.in);
//
//        int numGuesses = 0;
//
//        Random rObj = new Random();
//
//        int randomNumber = rObj.nextInt(10) + 1;
//
//        // int randomNumber = 8;
//
//        System.out.println(" ************************ ");
//
//        System.out.println("Welcome to the Guessing Game");
//
//        System.out.println(" ************************ ");
//
//        System.out.println();
//
//        System.out.print("Enter an int from 1 to 10: ");
//
//        int inputNumber = keyboard.nextInt();
//
//
//
//        numGuesses++;
//
//
//
//
//
//        /****************************/
//
//        while (inputNumber != randomNumber) {
//
//            System.out.println();
//
//            System.out.println("Try again...");
//
//            System.out.print("Enter an int from 1 to 10: ");
//
//            inputNumber = keyboard.nextInt();
//
//            numGuesses++;
//
//        }
//
//        System.out.print("You win after ");
//
//        System.out.println(numGuesses + " guesses.");
//
//        keyboard.close();

//    }

//}

