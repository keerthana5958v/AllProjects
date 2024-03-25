import java.util.Random;

public class BookingManager {
    public BookingManager() {
    }

    public BookingManager(String airline, String location, String destination, String flightNumber, String date, String time, String seatNo) {
        String blackBG = ConsoleColors.BLACK_BACKGROUND;
        String reset = ConsoleColors.RESET;
        String blackHash = ConsoleColors.BLACK_BACKGROUND + " # " + reset;
        System.out.println(blackBG + " # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #" + reset + blackHash);
        System.out.println(blackBG + " # " + reset + ConsoleColors.BLUE_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + "   " + airline + "                                              " + reset + blackHash);
        System.out.println(blackBG + " #                                                          " + ConsoleColors.RESET + blackHash);
        System.out.println(blackBG + " # " + ConsoleColors.BLUE_BOLD + "\tFrom:  " + reset + blackBG + location + "                                        " + reset + blackHash);
        System.out.println(blackBG + " # " + ConsoleColors.BLUE_BOLD + "\tTo:  " + reset + blackBG + destination + "                                          " + reset + blackHash);
        System.out.println(blackBG + " # " + ConsoleColors.BLUE_BOLD + "\tFlight Number:  " + reset + blackBG + flightNumber + "                                  " + reset + blackHash);
        System.out.println(blackBG + " # " + ConsoleColors.BLUE_BOLD + "\tDate and time:  " + reset + blackBG + date + ", " + time + "                       " + reset + blackHash);
        System.out.println(blackBG + " # " + ConsoleColors.BLUE_BOLD + "\tSeat Number:  " + reset + blackBG + seatNo + "                                       " + reset + blackHash);
        System.out.println(blackBG + " #                                                          " + reset + blackHash);
        System.out.println(blackBG + " # " + ConsoleColors.RED_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + "   BOARDING PASS                                         " + reset + blackHash);
        System.out.println(blackBG + " # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #" + reset + blackHash);
    }

    public void invoiceBillGenerator(long cost) {
        String b = ConsoleColors.BLACK_BACKGROUND + ConsoleColors.BLACK_BOLD_BRIGHT;
        System.out.println(b + " # # # # # # # # # # # # # # # # # " + ConsoleColors.RESET);
        System.out.println(b + " # " + ConsoleColors.RESET + "                             " + b + " # " + ConsoleColors.RESET);
        System.out.println(b + " # " + ConsoleColors.RESET + ConsoleColors.GREEN_BOLD + "   Your ticket invoice:      " + ConsoleColors.RESET + b + " # " + ConsoleColors.RESET);
        System.out.println(b + " # " + ConsoleColors.RESET + "\t  " + ConsoleColors.GREEN_BOLD_BRIGHT + "$ " + cost + ConsoleColors.RESET);
        System.out.println(b + " # " + ConsoleColors.RESET + "                             " + b + " # " + ConsoleColors.RESET);
        System.out.println(b + " # # # # # # # # # # # # # # # # # " + ConsoleColors.RESET);
    }

    public static void generateQRPattern() {
        System.out.println("\n\n\n" + ConsoleColors.BLACK_BACKGROUND + "       MAKE YOUR PAYMENT      " + ConsoleColors.RESET + "\n");
        int rows = 10;
        int cols = 10;
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        String bg = ConsoleColors.WHITE_BOLD + ConsoleColors.BLACK_BACKGROUND;
        sb.append(bg);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                sb.append(bg);
                boolean randBool = random.nextBoolean();
                if (randBool) {
                    sb.append(" * ");
                } else {
                    sb.append("   ");
                }
            }
            sb.append(ConsoleColors.RESET);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    void printTicketDetails(String airline, String location, String destination, String flightNumber, String date, String time, String seatNo) {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n\n\nHere are the details of your aviation\n" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tAirline:  " + ConsoleColors.RESET + airline);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tLocation:  " + ConsoleColors.RESET + location);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tDestination:  " + ConsoleColors.RESET + destination);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tFlight number:  " + ConsoleColors.RESET + flightNumber);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tDate and time:  " + ConsoleColors.RESET + date + ", " + time);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tSeat number:  " + ConsoleColors.RESET + seatNo);
    }

    public static void main(String[] args) {
        BookingManager obj = new BookingManager();
//        obj.printBoardingPass("Go Air  ", "Hyderabad", "Bangalore","AD1234", "13/11/2023", "23:05","F06");

    }

}
