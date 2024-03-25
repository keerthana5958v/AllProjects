import java.util.Objects;
import java.util.Scanner;

public class UserFlowController {
    public void welcomeUser() {
        printSlowly(ConsoleColors.WHITE_BOLD_BRIGHT + "Welcome to our domestic airline booking application! \nWe're thrilled to have you on board as we embark on a journey of convenience and adventure" + ConsoleColors.RESET, 40);
    }

    public void askFAQ() throws InterruptedException {
        String inst = "\nPress" + ConsoleColors.CYAN_BOLD + " \"FAQ\" " + ConsoleColors.RESET + "to view our frequently asked questions.\nPress" + ConsoleColors.RED + " (exit)" + ConsoleColors.RESET + " to terminate your booking\nor press any key to continue.";
        System.out.println(inst);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (Objects.equals(input.toUpperCase(), "FAQ")) {
            displayFAQQuestion();
            displayFAQAnswer();
            System.out.println(inst);
            input = sc.nextLine();
        }
        while (input.equalsIgnoreCase("exit")) {
            exit();
        }
    }

    String[] question = new String[]{
            "Are meals included in my booking?",
            "Can I cancel my booking?",
            "Can I make changes to my booking?",
            "Can I use coupon or promotional links on booking?",
            "Can I use credit to make seat bookings?"};
    String[] answers = new String[]{
            "Yes, there are meals available in our airlines",
            "Cancellation can only be done manually at your airport 24 hours before the flight.",
            "It's not possible to make any changes to your booking. This includes actions like changing the stay dates, guest name or email address.",
            "No, this booking can't be made with rewards or incentive programmes.",
            "No, it’s not possible to use travel credit towards bookings."};

    public boolean isProperFAQInput(String input) {
        if (input.length() != 1 || !Character.isDigit(input.charAt(0))) {
            return false;
        }
        int ansNo = Integer.parseInt(input);
        return (ansNo >= 1 && ansNo <= answers.length);
    }

    void displayFAQAnswer() {
        Scanner scanner;
        while (true) {
            System.out.println("\nEnter the number of the FAQ answer -> " + ConsoleColors.RESET);
            scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (isProperFAQInput(input)) {
                int ansNo = Integer.parseInt(input) - 1;
                System.out.println();
                System.out.println(ConsoleColors.CYAN_BOLD + "Q.  " + ConsoleColors.RESET + question[ansNo]);
                System.out.println(ConsoleColors.CYAN_BOLD + " >>\t" + ConsoleColors.CYAN + answers[ansNo] + ConsoleColors.RESET);
                break;
            } else {
                System.out.println(ConsoleColors.YELLOW + "Invalid input. Please enter a valid question number." + ConsoleColors.RESET);
            }
        }

    }

    public void displayFAQQuestion() {
        System.out.println(ConsoleColors.CYAN_BOLD + "FAQs" + ConsoleColors.RESET);
        for (int i = 0; i < question.length; i++) {
            int j = i + 1;
            System.out.println(ConsoleColors.CYAN_BOLD + j + ".  " + ConsoleColors.RESET + ConsoleColors.CYAN + question[i] + ConsoleColors.RESET);
        }
    }

    void exit() throws InterruptedException {
        String ex = ConsoleColors.RED_BRIGHT + "\n\t\tApplication shutdown in progress...\n\t\tThank you for using our application!\n\t\tGoodbye..." + ConsoleColors.RESET;
        printSlowly(ex, 60);
        System.exit(0);
    }

    void seatBooked() {
        printSlowly(ConsoleColors.GREEN_BOLD + "\nBooking complete! Your seat is confirmed. Get ready for a comfortable journey with us. Bon voyage!\n" + ConsoleColors.RESET, 50);
    }

    void thankYouUser() throws InterruptedException {
        System.out.println(ConsoleColors.CYAN_BOLD);
        printSlowly("Thanks for being a valued user of our airplane booking system.\n", 40);
        System.out.println(ConsoleColors.RESET);
        exit();

    }

    public void completePayment() {
        printSlowly(ConsoleColors.GREEN_BOLD_BRIGHT + "_".repeat(30), 500);
        System.out.println("\nPayment completed" + ConsoleColors.RESET);

    }

    public void displaySeatInfo() {
        String s = "These are the available seats of your preferred airplane.\nKindly select any 1 seat number between " + ConsoleColors.WHITE_BRIGHT + "  1 - 12" + ConsoleColors.RESET + ".\n\n\t\tSEATS-->\t";
        printSlowly(s, 50);
    }

    void printSlowly(String str, int millis) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(millis);
            } catch (Exception ignored) {
            }
        }
    }

    void doExit() throws InterruptedException {
        System.out.println("\n\nPress any key to continue or Press" + ConsoleColors.RED + " (exit) " + ConsoleColors.RESET + "to terminate your booking");
        Scanner sc = new Scanner(System.in);
        while (sc.nextLine().equalsIgnoreCase("exit")) {
            exit();
        }
    }
}
