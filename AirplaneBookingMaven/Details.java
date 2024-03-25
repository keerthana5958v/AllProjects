import java.util.ArrayList;
import java.util.Scanner;

public class Details {
    public String name;

     public String getName(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name:\t");
         String name = sc.nextLine();
         return name;
     }
     public void setName(String name){ // pass variable in main class
         if (name != null && !name.isEmpty()) {
             this.name = name;
         } else {
             System.out.println("Name is invalid; Your name is being recognized by your phone number");
             this.name = gettingValidNumber(); // user is identified by number is name is not valid !!
         }
     } // call set name instead of get name

     String getNumber(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your 10 digit mobile number:\t");
        //  sc.close();
         return sc.nextLine();
         
     }
     boolean isValidNumber(String gettingNum){
         try{
             if(gettingNum.length() != 10){
                 return false;
             }
             long num = Long.parseLong(gettingNum);
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

    public String selectFlightClass(String input) {
        return switch (input) {
            case "1" -> "E";
            case "2" -> "B";
            case "3" -> "F";
            default -> "NA";
        };
    }//switch case Flight Class
    public String returnFlightClass(){
        Scanner scanner = new Scanner(System.in);
        String input;
        String result;
        do {
            System.out.println("Enter a number 1, 2, or 3: ");
            input = scanner.nextLine();
            result = selectFlightClass(input);
            if(result.equals("F")){System.out.println("you have selected first class ticket");}
            if(result.equals("B")){System.out.println("you have selected business class ticket");}
            if(result.equals("E")){System.out.println("you have selected Economy class ticket");}
        } while (result.equals("NA"));
        scanner.close();
        return result;} // returns F , B or E

     void displayAvailableLocations(){
         ArrayList<String> availableLocation = availableLocations();
         System.out.println("Select your location ->");
         for(int i = 0 ; i < availableLocation.size() ; i++){
             int j = i+1;
             System.out.println(j+". "+ availableLocation.get(i));
         }
     }
     String getLocation(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your location by number:");
         return sc.nextLine();
     }
     boolean isValidLocation(String loc){
         ArrayList<String> availableLocation = availableLocations();
         try{
             int locationNumber = Integer.parseInt(loc);
             return (locationNumber>0 && locationNumber<availableLocation.size() + 1);
         }catch (Exception ignored){return false;}
     }
     int getValidLocation(){
         String locationNumber;
         displayAvailableLocations();
         do{
             locationNumber = getLocation();
         }while(!isValidLocation(locationNumber));
         int locationIndex = (Integer.parseInt(locationNumber) - 1);
         return locationIndex;
     }

    ArrayList<String> returnAvailableDestination(){
         ArrayList<String> availableDestination = availableLocations();
         availableDestination.remove(getValidLocation());
         return availableDestination;
     }
    String getDestination(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your destination by number:");
        return sc.nextLine();
    }
    ArrayList<String> availableDestination = returnAvailableDestination();
    boolean isValidDestination(String loc){
        try{
            int destinationNumber = Integer.parseInt(loc);
            return (destinationNumber>0 && destinationNumber<this.availableDestination.size() + 1);
        }catch (Exception ignored){return false;}
    }
    int getValidDestination(){ // returns destination index
        String destinationNumber;
        displayAvailableDestination();
        do{
            destinationNumber = getDestination();
        }while(!isValidDestination(destinationNumber));
        int destinationIndex = (Integer.parseInt(destinationNumber) - 1);
        return destinationIndex;
    }
    void displayAvailableDestination(){
        System.out.println("Select your destination ->");
        for(int i = 0 ; i < availableDestination.size() ; i++){
            int j = i+1;
            System.out.println(j+". "+ availableDestination.get(i));
        }
    }
    public ArrayList<String> availableLocations(){
        ArrayList<String> location = new ArrayList<String>();
        location.add("hyderabad");
        location.add("chennai");
        location.add("bombay");
        location.add("bangalore");
        location.add("delhi");
        return location;
    }

    public static void main(String[] args) {
        Details obj = new Details();
//        obj.getValidDestination();
    }
    public String askForMeals() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to include meals (Y/N)");
        return scan.nextLine().toUpperCase();
    } // returns user input

    public String isMealRequired(String input) { // is meal required Switch
        return switch (input) {
            case "Y" -> "Y";
            case "N" -> "N";
            default -> "NA";
        };
    }
    public void isMealIncluded() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String result;
        do {
            System.out.println("Enter Y/N ");
            input = scanner.nextLine().toUpperCase();
            result = isMealRequired(input);
            if (result.equals("Y")) {System.out.println("Meals are included in your ticket.");}
            if(result.equals("N")) {System.out.println("Meal not include");}
        }
        while (result.equals("NA"));
        scanner.close();
    }
}
