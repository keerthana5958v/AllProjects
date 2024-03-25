import java.util.Scanner;

public class ClientBookingDetails extends FlightDetails{
    /*  username and number */
    static int getNameCount = 0;
    public String getName(){
        Scanner sc = new Scanner(System.in);
        if(getNameCount==0){
            System.out.println("Enter your name:\t");}
        else if(getNameCount<=5){
            System.out.println(ConsoleColors.YELLOW+"Enter your name:\t"+ConsoleColors.RESET);}
        else{
            System.out.println(ConsoleColors.RED+"Enter your name:\t"+ConsoleColors.RESET);}
        getNameCount++;
        return sc.nextLine();
    }
    String getValidName(){
        String name;
        do{
            name=getName();
        }while (name.isEmpty());
        return name;
    }

    static int getNumberCount = 0;
    String getNumber(){
        Scanner sc = new Scanner(System.in);
        if(getNumberCount==0){
            System.out.println("Enter your 10 digit mobile number:\t");}
        else if(getNumberCount<6){System.out.println(ConsoleColors.YELLOW+"Enter your 10 digit mobile number:\t"+ConsoleColors.RESET);}
        else{System.out.println(ConsoleColors.RED+"Enter your 10 digit mobile number:\t"+ConsoleColors.RESET);}
        getNumberCount++;
        return sc.nextLine();
    }
    boolean isValidNumber(String gettingNum){
        try{
            if(gettingNum.length() != 10){
                return false;
            }
            Long.parseLong(gettingNum);
            return true;
        }
        catch (Exception ignored){return false;}
    }
    String gettingValidNumber(){ // use this in main method
        String validNumber;
        do {
            validNumber = getNumber();
        } while (!isValidNumber(validNumber));
        return validNumber;
    }

    /*  meals section  */

    public String isMealRequired(String input) { // is meal required Switch
        return switch (input) {
            case "Y" -> "Y";
            case "N" -> "N";
            default -> "NA";
        };
    }
    static int askMealCount = 1;
    static int askMealTypeCount = 1;
    public void isMealIncluded() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String result;

        System.out.println("Do you want to include meals?");
        do {
            if(askMealCount==1){
                System.out.println("Enter (Y/N) ");}
            else {
                System.out.println(ConsoleColors.YELLOW+"Enter (Y/N) "+ConsoleColors.RESET);
            }
            askMealCount++;
            input = scanner.nextLine().toUpperCase();
            result = isMealRequired(input);
            if (result.equals("Y")) {System.out.println(ConsoleColors.GREEN+"Meals are included in your ticket."+ConsoleColors.RESET);getValidMealType();}
            if(result.equals("N")) {System.out.println(ConsoleColors.GREEN+"Meals are not a part of your ticket"+ConsoleColors.RESET);}
        }
        while (result.equals("NA"));
    }
    String getMealType() {
        Scanner sc = new Scanner(System.in);
        if(askMealTypeCount==1){
            System.out.println("Select your meal type.\npress \"A\" for Vegan and \"B\" for Non-vegetarian");}
        else{
            System.out.println(ConsoleColors.YELLOW+"\npress \"A\" for Vegan and \"B\" for Non-vegetarian"+ConsoleColors.RESET);
        }
        askMealTypeCount++;
        return sc.nextLine();
    }
    long mealCost = 0;
    String isValidMealType(){

        String mealType = getMealType().toUpperCase();
        switch (mealType) {
            case "A":
                mealCost=260;
                return "Vegan";
            case "B":
                mealCost = 380;
                return "Non-vegetarian";
            default:
                return "NA";
        }
    }
    void getValidMealType(){
        String input;
        do{
            input = isValidMealType();
        }while(input.equals("NA"));
        System.out.println(ConsoleColors.GREEN+input+" meals are included in your flight"+ConsoleColors.RESET);
    }

}
//no of methods = 8