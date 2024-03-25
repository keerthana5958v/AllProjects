package org.example;

public class Bunnies {
    static int count = 0;
    static int noOfRef = 0 ;
    public Bunnies(){
        while(count < 10){
            new Bunnies(++count);
        }
        noOfRef++;
    }
    public Bunnies(int x){
        noOfRef++;
    }

    public static void main(String[] args) {
        new Bunnies();
        new Bunnies(count);
        System.out.println("total count --> "+ noOfRef);
    }
}
