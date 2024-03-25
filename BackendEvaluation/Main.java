package org.example;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Information infoObj = new Information();
        FileStorage fileStorage = new FileStorage();
        System.out.println("enter information to write to file or db, press q to exit");
        String name = infoObj.getName();
        String number = infoObj.getNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to write to file\nenter 2 to write to db");

        if(Objects.equals(sc.nextLine(), "1")){
            fileStorage.writeToFile(name,number);
            fileStorage.bw.close();
        }
        else if(Objects.equals(sc.nextLine(), "2")){

        }

    }
}