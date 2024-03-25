import java.util.Scanner;

public class NimGame{
    public static void main(String[] args) {
        NimGame s = new NimGame();
        s.playGame();

    }
    public void playGame(){
        while( completeArray[0] != 0 ){
            playGameByUser();
            computerPlay();
        }
    }
    private int[] completeArray;
    private int computerGenIndex;
    private int userInput;
    public NimGame(){
        this.completeArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    public NimGame(int[] arr){
        this.completeArray = arr;
    }
    public void computerPlay(){
        System.out.println(toString(computerArrayManipulation()));
    }
    public int[] computerArrayManipulation(){
        computerGenIndex = (int) (Math.random()*2)+1;
        System.out.println("computer's turn \nComputer chooses "+ computerGenIndex);
//        System.out.println("comp index"+computerGenIndex);
        if (computerGenIndex == 1) {
            for (int i = completeArray.length - 1; i >= 0; i--) {
                if (completeArray[i] != 0) {
                    completeArray[i] = 0;
                    break;
                }
            }
        }
        else if (computerGenIndex  == 2) {
            for (int i = completeArray.length - 1; i > 0; i--) {
                if (completeArray[i] != 0) {
                    completeArray[i] = 0;
                    if (i >0){
                        completeArray[i-1] = 0;
                    }
                    break;
                }
            }
        }
        return completeArray;
    }

    public int getInputNum(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number 1 or 2");
        userInput = s.nextInt();
        return userInput;
    }
    public void checkInput(){
        while (userInput != 1 && userInput!=2){
            System.out.println("enter proper input again");
            getInputNum();
        }

    }
    public String toString(int[] array){
        String s = "";
        for (int i = 0 ; i < array.length ; i++){
            s += array[i] + " ";
        }
        return s;
    }
    public int[] arrayManipulation(){
        if (userInput == 1) {
            for (int i = completeArray.length - 1; i >= 0; i--) {
                if (completeArray[i] != 0) {
                    completeArray[i] = 0;
                    break;
                }
            }
        }
        if (userInput == 2) {
            for (int i = completeArray.length - 1; i >= 0; i--) {
                if (completeArray[i] != 0) {
                    completeArray[i] = 0;
                    try{
                        completeArray[i-1] = 0;
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                    }
                    break;
                }
            }
        }

        return completeArray;
    }
    public void playGameByUser(){
        getInputNum();
        checkInput();
        System.out.println(toString(arrayManipulation()));
    }
}