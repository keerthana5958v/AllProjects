package org.example;

import java.util.Scanner;

public class HelloWorld {

    String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    void printPattern(String str){
        String specChar = "!@#$%^&*()<!>?:{}][\\.,|-_+=`~";
        char[] seq = str.toCharArray();
        int originalASCII;
        String res= "";

        for (int i = 0; i < seq.length; i++) {
            if(seq[i]==Character.toUpperCase(seq[i])){
                originalASCII = 65;
            }
            else originalASCII = 97;

            if(Character.isDigit(seq[i])) res += seq[i];
            else if(seq[i]==' '){
                res += " ";
            }
            else if (seq[i]=='\n') {
                res += "\n";

            } else if(specChar.contains(seq[i]+"")){
                res += seq[i];
                System.out.println(res);
            }

            else {
                while (seq[i] >= originalASCII) {
                    System.out.println(res + (char) originalASCII);

                    if (seq[i] == originalASCII) {
                        res += (char) originalASCII;
                    }
                    originalASCII++;
                    try {
                        Thread.sleep(30);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HelloWorld obj = new HelloWorld();
//        Thread.sleep(6000);
        obj.printPattern("Welcome to Zoho schools :)");

    }
}
