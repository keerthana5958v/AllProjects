import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class DateFormatVerifier {
    private String date;
    private final int thisYear = Integer.parseInt(LocalDate.now().toString().substring(0,4));
    private final int thisMonth = Integer.parseInt(LocalDate.now().toString().substring(5,7));
    private final int thisDate = Integer.parseInt(LocalDate.now().toString().substring(8,10));


    private int getDay() {
        String day = date.substring(0, 2);
        return Integer.parseInt(day);
    }
    private int getMonth() {
        String month = date.substring(3, 5);
        return Integer.parseInt(month);
    }
    private int getYear() {
        String year = date.substring(6, 10);
        return Integer.parseInt(year);
    }
    private static int getDateCount = 0;
    public String input() {
        Scanner scanObj = new Scanner(System.in);
        if(getDateCount==0){System.out.println("Enter the date in DD/MM/YYYY format:");}
        else if(getDateCount<=5){System.out.println(ConsoleColors.YELLOW+"Please select your flight date starting from tomorrow in DD/MM/YYYY format\nDate must not exceed 2 months from today"+ConsoleColors.RESET);}
        else{System.out.println(ConsoleColors.RED+"Please select your flight date starting from tomorrow in DD/MM/YYYY format\nDate must not exceed 2 months from today"+ConsoleColors.RESET);}
        date = scanObj.nextLine();
        getDateCount++;
        return date;
    }
    public boolean isFirstSlash() {
        return date.charAt(2) == '/';
    }
    public boolean isSecondSlash() {
        return date.charAt(5) == '/';
    }
    public boolean isValidDay() {

        if(getYear() == thisYear+1){
            return (getDay() >= 1 && getDay() <= 31);
        }
        else if((getYear() == thisYear)&&(getMonth()>thisMonth)){
            return (getDay() >= 1 && getDay() <= 31);
        }
        else if((getYear() == thisYear)&&(getMonth()==thisMonth)){
            return (getDay() > thisDate && getDay() <= 31);
        }
        return false;
    }
    public boolean isValidMonth() {
        if(getYear()>thisYear){return (getMonth() >= 1 && getMonth() <= 12 );}
        else{return ((getMonth() >= 1 && getMonth() <= thisMonth )&&(getYear()==thisYear));}
//        return false;
    }
    public boolean isValidYear() {
        return (getYear() == thisYear) || (getYear() == thisYear+1);
    }
    public boolean isLength() {
        return date.length() == 10;
    }
    public boolean validDayCount(){
        return getDay()<=31 && getDay()>=1;
    }
    public boolean validMonthCount(){
        return getMonth()<=12 && ((getYear()==thisYear && getMonth()>=thisMonth) || (getYear()>thisYear && getMonth()>=1));
    }
    public boolean validYearCount(){
        return getYear()>=thisYear;
    }
    public boolean isLeapYear() {
        int year = getYear();
        return year % 4 == 0 || (year % 100 != 0 && year % 400 == 0);
    }
    public boolean isDayMonth() {
        if (getMonth() == 2) {
            if (isLeapYear()) {
                return getDay() >= 1 && getDay() <= 29;
            } else {
                return getDay() >= 1 && getDay() <= 28;
            }
        } else if (getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11) {
            return getDay() >= 1 && getDay() <= 30;
        } else {
            return getDay() >= 1 && getDay() <= 31;
        }
    }
    public boolean verifier() {
        return (isLength() && isFirstSlash() && isSecondSlash() && isValidDay() && isValidMonth() && isValidYear() && validDayCount() && validMonthCount() && validYearCount() && isDayMonth());}

    public String getValidDate(){
        System.out.println(ConsoleColors.CYAN_BOLD+"Select your preferred date of flight");
        System.out.println("Please select your flight date starting from tomorrow\nDate must not exceed 2 months from today\n"+ConsoleColors.RESET);
        do{date = input();}
        while(!verifier() || !isValidDateWithinRange());
        return date;
    }

    public static void main (String[]args){
        DateFormatVerifier mainObj = new DateFormatVerifier();
        System.out.println(mainObj.getValidDate());
    }
    // this class has method to get only from tomorrow's date
    public boolean isValidDateWithinRange() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate inputDate = LocalDate.parse(this.date, formatter);

            LocalDate today = LocalDate.now();
            LocalDate threeMonthsFromToday = today.plus(2, ChronoUnit.MONTHS);

            // Check if the input date is on or after today, and on or before 2 months from today
            return !inputDate.isBefore(today) && !inputDate.isAfter(threeMonthsFromToday);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

//no of methods = 17