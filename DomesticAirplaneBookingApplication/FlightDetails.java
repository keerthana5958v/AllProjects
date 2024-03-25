package ConsoleProject;
import java.util.ArrayList;
import java.util.Scanner;

public class FlightDetails {
    /*  methods to get valid available airline  */
    private static int getAirlineCount = 0;
    private String getAirline() {
        Scanner sc = new Scanner(System.in);
        if(getAirlineCount == 0){
        System.out.println("Select your Airline by number: "+ConsoleColors.RESET);}
        else if (getAirlineCount<5){System.out.println(ConsoleColors.YELLOW+"Select your Airline by number: "+ConsoleColors.RESET);}
        else{System.out.println(ConsoleColors.RED+"PRESS your Airline number (1-5): "+ConsoleColors.RESET);}
        getAirlineCount++;
        return sc.nextLine();
    }
    protected void displayAirline() {
        String[] availableAirlines = new String[]{"Indigo", "AirIndia", "SpiceJet", "Vistara", "GoAir"};
        for (int i = 0; i < availableAirlines.length; i++) {
            int j = i + 1;
            System.out.println(ConsoleColors.CYAN_BOLD+j +ConsoleColors.RESET+ ". " +ConsoleColors.CYAN+ availableAirlines[i]+ConsoleColors.RESET);
        }
    }
    private String selectingAirline() {
        String airlineNum = getAirline();
        return switch (airlineNum) {
            case "1" -> "Indigo  ";//6
            case "2" -> "AirIndia";//8
            case "3" -> "SpiceJet";//8
            case "4" -> "Vistara ";//7
            case "5" -> "Go Air  ";//6
            default -> "NA"; // all 8 length()
        };
    }
    protected String gettingValidAirline() {
        String selectedAirline;
        do {
            selectedAirline = selectingAirline();
        } while (selectedAirline.equals("NA"));
        return selectedAirline;
    }

    /*  methods to select flight class  */
    private static int getFlightClassCount = 0;
    private String selectFlightClass(String input) {
        return switch (input) {
            case "1" -> "E";
            case "2" -> "B";
            case "3" -> "F";
            default -> "NA";
        };
    }//switch case Flight Class
    protected String returnFlightClass(){
        Scanner scanner = new Scanner(System.in);
        String input;
        String result;
        System.out.println("Select your seat type. "+ConsoleColors.CYAN_BOLD+"(1) "+ConsoleColors.RESET+"Economy, "+ConsoleColors.CYAN_BOLD+"(2) "+ConsoleColors.RESET+"Business or "+ConsoleColors.CYAN_BOLD+"(3) "+ConsoleColors.RESET+"First Class");
        do {
            if(getFlightClassCount==0){System.out.println("Enter "+ConsoleColors.CYAN_BOLD+"1"+ConsoleColors.RESET+" for Economy, "+ConsoleColors.CYAN_BOLD+"2"+ConsoleColors.RESET+" for Business, "+ConsoleColors.CYAN_BOLD+"3"+ConsoleColors.RESET+" for First Class");}
            else if(getFlightClassCount<5){System.out.println(ConsoleColors.YELLOW+"Enter 1 for Economy, 2 for Business, 3 for First Class"+ConsoleColors.RESET);}
            else{System.out.println(ConsoleColors.RED+"Enter 1 for Economy, 2 for Business, 3 for First Class"+ConsoleColors.RESET);}
            getFlightClassCount++;
            input = scanner.nextLine();
            result = selectFlightClass(input);
            if(result.equals("F")){System.out.println(ConsoleColors.GREEN+"You have selected First class ticket"+ConsoleColors.RESET);}
            if(result.equals("B")){System.out.println(ConsoleColors.GREEN+"You have selected Business class ticket"+ConsoleColors.RESET);}
            if(result.equals("E")){System.out.println(ConsoleColors.GREEN+"You have selected Economy class ticket"+ConsoleColors.RESET);}
        } while (result.equals("NA"));
        return result;
    } // returns F , B or E

    /*  methods to select seat  */
    private final String seat = ConsoleColors.YELLOW_BACKGROUND_BRIGHT + "   " + ConsoleColors.RESET + "  ";

    protected void displaySeats(){
        String seats = String.valueOf(this.seat).repeat(12);
        System.out.println(seats);
    }
    protected int changeBookedSeat(){
        int seatNum = Integer.parseInt(checkSeatValidity());
        int index = (seatNum - 1)*17;
        String newSeat = String.valueOf(this.seat).repeat(12);

        String bookedSeat = ConsoleColors.GREEN_BACKGROUND + "   " + ConsoleColors.RESET + "  ";
        newSeat = newSeat.substring(0, index) + bookedSeat + newSeat.substring(index, (newSeat.length() - 17));
        System.out.println(newSeat);
        return seatNum;
    }
    private String getSeatNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter seat number:");
        return sc.nextLine();
    }
    private String checkSeatValidity() {
        String seatNum;
        do {
            seatNum = getSeatNum();
        } while (!isValidSeatNumber(seatNum));

        return seatNum;
    }
    private boolean isValidSeatNumber(String seatNum) {
        try {
            int seat = Integer.parseInt(seatNum);
            if (seat >= 1 && seat < 13) {
                return true;
            } else {
                System.out.println(ConsoleColors.YELLOW+"Seat number is out of range. Enter seat number *between 1 - 12"+ ConsoleColors.RESET);
            }
        } catch (NumberFormatException e) {
            System.out.println(ConsoleColors.YELLOW+"Invalid input. Please enter a valid number."+ ConsoleColors.RESET);
        }
        return false;
    }

    /* methods to get location and destination from user*/
    protected ArrayList<String> availableLocations(){
        ArrayList<String> location = new ArrayList<>();
        location.add("Hyderabad");//9
        location.add("Chennai  ");//7
        location.add("Bombay   ");//6
        location.add("Bangalore");//9
        location.add("Delhi    ");//5
        return location; // all 9 length()
    }

    private void displayAvailableLocations(){
        ArrayList<String> availableLocation = availableLocations();
        System.out.println(ConsoleColors.CYAN_BOLD+"\nSelect your location ->"+ConsoleColors.RESET);
        for(int i = 0 ; i < availableLocation.size() ; i++){
            int j = i+1;
            System.out.println(ConsoleColors.CYAN_BOLD+j+". "+ConsoleColors.CYAN +availableLocation.get(i)+ConsoleColors.RESET);
        }
    }
    private static int getLocationCount = 0;
    private String getLocation(){
        Scanner sc = new Scanner(System.in);
        if(getLocationCount==0){
        System.out.println("Enter your location by number:");}
        else if(getLocationCount<5){
            System.out.println(ConsoleColors.YELLOW+"Enter your location by number:"+ConsoleColors.RESET);
        }
        else {System.out.println(ConsoleColors.RED+"Enter your location by number:"+ConsoleColors.RESET);}
        getLocationCount++;
        return sc.nextLine();
    }
    private boolean isValidLocation(String loc){
        ArrayList<String> availableLocation = availableLocations();
        try{
            int locationNumber = Integer.parseInt(loc);
            return (locationNumber>0 && locationNumber<availableLocation.size() + 1);
        }catch (Exception ignored){return false;}
    }
    private int getValidLocation() {
        String locationNumber;
        displayAvailableLocations();
        do {
            locationNumber = getLocation();
        } while (!isValidLocation(locationNumber));
        return (Integer.parseInt(locationNumber) - 1);
    }
    private ArrayList<String> returnAvailableDestination(){
        ArrayList<String> availableDestination = availableLocations();
        availableDestination.remove(locationIndex);
        return availableDestination;
    }
    int locationIndex = getValidLocation();
    private static int getDestinationCount = 0;
    private String getDestination(){
        Scanner sc = new Scanner(System.in);
        if(getDestinationCount==0){
            System.out.println("Enter your destination by number:");
        }
        else if(getDestinationCount<=5 ){
            System.out.println(ConsoleColors.YELLOW+"Enter your destination by number:"+ConsoleColors.RESET);
        }
        else {
            System.out.println(ConsoleColors.RED+"Enter your destination by number:"+ConsoleColors.RESET);
        }
        getDestinationCount++;
        return sc.nextLine();
    }
    protected ArrayList<String> availableDestination = returnAvailableDestination();
    private boolean isValidDestination(String loc){
        try{
            int destinationNumber = Integer.parseInt(loc);
            return (destinationNumber>0 && destinationNumber<this.availableDestination.size() + 1);
        }catch (Exception ignored){return false;}
    }
    protected int getValidDestination(){ // returns destination index
        String destinationNumber;
        displayAvailableDestination();
        do{
            destinationNumber = getDestination();
        }while(!isValidDestination(destinationNumber));
        return (Integer.parseInt(destinationNumber) - 1);
    }
    private void displayAvailableDestination(){
        System.out.println(ConsoleColors.CYAN_BOLD+"Select your destination ->" + ConsoleColors.RESET);
        for(int i = 0 ; i < availableDestination.size() ; i++){
            int j = i+1;
            System.out.println(ConsoleColors.CYAN_BOLD+j+". "+ConsoleColors.CYAN +availableDestination.get(i) + ConsoleColors.RESET);
        }
    }
}
//no of methods = 21