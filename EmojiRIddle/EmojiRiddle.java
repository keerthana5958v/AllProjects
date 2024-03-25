import java.util.Scanner;

public class EmojiRiddle {
    String[] questionArray = {"\uD83D\uDC2D \uD83D\uDC68\u200D\uD83C\uDF73", "\uD83D\uDC78 \uD83D\uDC38", "\uD83D\uDD77\uFE0F\uD83E\uDDD4\uD83C\uDFFB", "\uD83E\uDD4B\uD83D\uDC3C", "⬆\uFE0F\uD83C\uDF88"};
    String[] answerArray = {"ratatouille", "princess and the frog", "spiderman", "kungfu panda", "up"};
    int randomIndex = (int) (Math.random() * (questionArray.length));
    int questionIndex = randomIndex;

    public static void main(String[] args) {
        EmojiRiddle obj = new EmojiRiddle();
        obj.playGame(obj.getPlayerName());
    }
    public String getPlayerName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the player");
        return scanner.nextLine();
    }

//    public String askQuestion() {
//        Scanner scanObj = new Scanner(System.in);
//        System.out.println("Question -->" + questionArray[randomIndex]);
//        String givenAnswer = scanObj.nextLine();
//        return givenAnswer;
//    }
//    public boolean checkCorrectAnswer(){
//        return (askQuestion().equals(answerArray[questionIndex]));
//    }
//    public int lifeDecrement(){
//        int life = 3;
//        if (checkCorrectAnswer() == true){
//            life = life;
//        }
//        else {
//            life--;
//        }
//        return life;
//    }

//    public void playGame(String player){
//        askQuestion();
//        System.out.println("life of player "+" "+ player + lifeDecrement());
//    }
    public void playGame(String player) {
        int remainingLives = 3;
        int correctAnswerCount = 0;
        for (int i = 0; i < questionArray.length; i++) {
            Scanner scanObj = new Scanner(System.in);
            System.out.println("Question --> " + questionArray[i]);
            String givenAnswer = scanObj.nextLine();
            if (givenAnswer.equals(answerArray[i])) {
                System.out.println("Correct!");
                System.out.println("remaining lives --> " + remainingLives);
                correctAnswerCount++;
            }
            else {
                remainingLives--;
                System.out.println("Incorrect! Remaining lives: " + remainingLives);
            }


            if (remainingLives == 0) {
                System.out.println("Game Over! You have exhausted your remaining lives");
                break;
            }

        }
        System.out.println("\n\nGame Over!!! " + player + "'s final score: \n" + "lives remaining: " + remainingLives +"\nNumber of Correct Answers: " + correctAnswerCount);
    }

}
