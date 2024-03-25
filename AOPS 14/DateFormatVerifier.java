import java.util.Scanner;

public class DateFormatVerifier {
    public static void main(String[] args) {
        DateFormatVerifier obj = new DateFormatVerifier();
        obj.getDateFromUser();
        if (obj.checkValidity()){
            System.out.println("date is valid");
        }
        else {
            System.out.println("date is invalid\t\tEnter in DD/MM/YYYY form");
        }
    }
    String date;
    int dateInt;
    int monthInt;
    int yearInt;
    public void getDateFromUser(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter date in DD/MM/YYYY format");
        date=s.nextLine();
    }
    public boolean isAppropriateLength(){
        return date.length()==10;
    }
    public boolean doesBothSlashExist(){
        boolean slash1=date.charAt(2)=='/';
        boolean slash2=date.charAt(5)=='/';
        return slash1 & slash2;
    }
    public boolean validYear(){
        boolean validYear= false;
        String yearString= date.substring(6,10);
        yearInt = Integer.parseInt(yearString);
        if (yearInt>1970 && yearInt<2024) {
            validYear = true;
        }
        return validYear;
    }

    public boolean validMonth(){ //true
        boolean validMonth= false;
        String monthString= date.substring(3,5);
        monthInt = Integer.parseInt(monthString);
        if (monthInt>0 && monthInt<13){
            validMonth=true;
        }
        return validMonth;
    }
    public boolean validDate(){
        boolean validDate= false;
        String dateString= date.substring(0,2);
        dateInt = Integer.parseInt(dateString);
        if (dateInt>0 && dateInt<32){
            validDate=true;
        }
//        System.out.println(dateInt);
        return validDate;
    }
    public boolean validDateWithRespectToMonth(){
        boolean validityOfDate= false;
        if ((yearInt%4==0) && (monthInt==2) && (dateInt<30)) {
            validityOfDate=true;
        }
        else if ((yearInt%4!=0) && (monthInt==2) && (dateInt<29)) {
            validityOfDate=true;
        }
        else if ((monthInt==1 ||monthInt==3 ||monthInt==5 ||monthInt==7 ||monthInt==8 ||monthInt==10 ||monthInt==12) && dateInt<32) {
            validityOfDate=true;
        }
        else if ((monthInt==4 ||monthInt==6 ||monthInt==9 ||monthInt==11)  && dateInt<31) {
            validityOfDate=true;
        }
        return validityOfDate;

    }
    public boolean checkValidity(){
        boolean allCheck = isAppropriateLength() & doesBothSlashExist() & validYear() & validMonth() & validDate() & validDateWithRespectToMonth();
        return allCheck;
    }
}