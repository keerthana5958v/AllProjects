import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserFlowController instruction = new UserFlowController();
        Scanner scanObj = new Scanner(System.in);
        instruction.welcomeUser();
        instruction.askFAQ();
        ClientBookingDetails details = new ClientBookingDetails();
        String name = details.getValidName();
        String number = details.gettingValidNumber();
        if(name.length()<5){
            System.out.println(ConsoleColors.YELLOW+"Your name is too short, Including your phone number next to your name for identification"+ConsoleColors.RESET);
            name += number;
        }
        DateFormatVerifier dateObj = new DateFormatVerifier();
        String flightDate = dateObj.getValidDate();
        String location = details.availableLocations().get(details.locationIndex);
        int destinationIndex = details.getValidDestination();
        String destination = details.availableDestination.get(destinationIndex);
        long cost = 10_000;
        instruction.doExit();
        details.displayAirline();
        String airline = details.gettingValidAirline();
        String flightClass = details.returnFlightClass();
        if(Objects.equals(flightClass, "F")){
            cost = cost*83;
        }
        else if(Objects.equals(flightClass, "B")){
            cost = cost * 58;
        }
        else {cost = cost * 23;}
        instruction.displaySeatInfo();
        details.displaySeats();
        int seatNumber = details.changeBookedSeat();
        details.isMealIncluded();
        cost+=details.mealCost;
        instruction.doExit();
        CaptchaGenerator cap = new CaptchaGenerator();
        cap.getValidCaptcha();
        TimeGenerator time = new TimeGenerator();
        String flightTime = time.properTime();
        String seatNo;
        if(seatNumber<10){
            seatNo = flightClass +"0"+seatNumber;
        }
        else{
            seatNo = flightClass + seatNumber;}
        String flightNumber = cap.generateCaptcha("ABCDEFGHIJKLMNOPQR",2)+cap.generateCaptcha("1234567890",4);
        BookingManager booking = new BookingManager();
        booking.printTicketDetails(airline, location,destination,flightNumber,flightDate,flightTime,seatNo);
        cost = cost + ((cost*32)/100);
        booking.invoiceBillGenerator(cost);
        instruction.doExit();
        scanObj.close();
        BookingManager.generateQRPattern();
        instruction.completePayment();
        instruction.printSlowly(ConsoleColors.GREEN_BOLD+"\n\n\nHere is a digital copy of your AirPlane Boarding Pass\n\n"+ConsoleColors.RESET,20);
        new BookingManager(airline,location, destination, flightNumber, flightDate, flightTime, seatNo);
        instruction.seatBooked();
        System.gc();
        instruction.thankYouUser();
    }
}



