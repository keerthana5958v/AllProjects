package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Information infoObj = new Information();
            FileStorage fileStorage = new FileStorage();
            DBConnection dBConObj = new DBConnection();

            System.out.println("press any button to continue,\npress (exit) to exit");
            if (sc.nextLine().equals( "exit")) {
                System.exit(0);
            }

            System.out.println("enter 1 to write to file\n2 to write to db");
            String tem = sc.nextLine();
            int temp = 0;
            String name = infoObj.getName();
            String number = infoObj.getNumber();
            if(tem.equals("1")){
                fileStorage.writeToFile(name, number);
                temp = 1;
                System.out.println("data added to file\n\n");
            }
            else{
                dBConObj.writeToDB(name, number);
                System.out.println("data is added to DB\n\n");
                temp = 2;
            }
            System.out.println("enter 1 to view your data or any other key to exit");
            if(sc.nextLine().equals( "1")){
                if (temp == 1) {
                    fileStorage.viewData();
                }
                else{
                    System.out.println("displaying your db tables");
                    dBConObj.viewTable();
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}