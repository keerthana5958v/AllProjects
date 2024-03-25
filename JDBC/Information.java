package org.example;

import java.util.Scanner;

public class Information {
    String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        return sc.nextLine();
    }
    String getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Information obj = new Information();
        System.out.println(obj.getName()+"\t"+ obj.getNumber());
    }
}
