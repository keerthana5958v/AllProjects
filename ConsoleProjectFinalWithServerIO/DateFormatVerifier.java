
import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateFormatVerifier {
    public DateFormatVerifier() throws IOException {}
    ServerSide serverObj = new ServerSide();

    DataOutputStream dout = new DataOutputStream(ClientSide.s.getOutputStream());


    public void getUserInput() throws IOException {
        dout.writeUTF("*********** Date Format type is dd/MM/yyyy ***********");
        dout.writeUTF("only Enter the Date is today to Three month only");
        dout.writeUTF("Enter the booking date: ");
        Scanner scan = new Scanner(ServerSide.dtaIn);
        String userDate = scan.nextLine();
        while (true) {
            if (isValidDateWithinRange(userDate)) {
                dout.writeUTF("This is a valid date.");
                break;
            }
            else {
                dout.writeUTF("This date is not valid or not within the allowed range.");
                dout.writeUTF("Enter the booking date: ");
                userDate = scan.nextLine();
            }}

    }

    public static void main(String[] args) throws IOException {
        DateFormatVerifier obj = new DateFormatVerifier();
        obj.getUserInput();
    }

    public boolean isValidDateWithinRange(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(inputDate, formatter);

            LocalDate today = LocalDate.now();
            LocalDate threeMonthsFromToday = today.plus(3, ChronoUnit.MONTHS);

            return !date.isBefore(today) && !date.isAfter(threeMonthsFromToday);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}



