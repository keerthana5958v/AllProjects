import java.util.ArrayList;
import java.util.Scanner;

public class FlightInformation {

    String getAirline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your Airline by number ->");
        return sc.nextLine();
    }

    void displayAirline() {
        String[] availableAirlines = new String[]{"Indigo", "AirIndia", "SpiceJet", "Vistara", "GoAir"};
        for (int i = 0; i < availableAirlines.length; i++) {
            int j = i + 1;
            System.out.println(j + ". " + availableAirlines[i]);
        }
    }

    String selectingAirline() {
        String airlineNum = getAirline();
        switch (airlineNum) {
            case "1":
                return "Indigo";
            case "2":
                return "AirIndia";
            case "3":
                return "SpiceJet";
            case "4":
                return "Vistara";
            case "5":
                return "Go Air";
            default:
                return "NA";
        }
    }

    String gettingValidAirline() {
        String selectedAirline;
        do {
            selectedAirline = selectingAirline();
        } while (selectedAirline.equals("NA"));
        return selectedAirline;
    }

    public static void main(String[] args) {
        FlightInformation obj = new FlightInformation();
        obj.displayAirline();
//        String s = obj.gettingValidAirline();
//        System.out.println(s);
        System.out.println(obj.getValidMealType());

    }

    String getMealType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your meal type.\npress \"A\" for Vegan and \"B\" for Non-vegetarian");
        return sc.nextLine();
    }
    String isValidMealType(){
        String mealType = getMealType().toUpperCase();
        switch (mealType){
            case "A":
                return "Vegan";
            case "B":
                return "Non-vegetarian";
            default:
                return "NA";
        }
    }
    String getValidMealType(){
        String input;
        do{
            input = isValidMealType();
        }while(input.equals("NA"));
        return input;
    }
}
