package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Round {
    double roundOff(double num , int round){
        int numberOfDecimalValues = 0;
        if(num % 10 != 0) {
            while (num % 10 != 0) {
                num = num * 10;
                numberOfDecimalValues++;
            }
            num = num / 10;
            numberOfDecimalValues--;
        }
        long number = (long)num;
        // the digit at which number must be rounded off to
        int digitToRoundedNumber = (int) ((((number % (Math.pow(10,round))) - (number % (Math.pow(10,round-1))))));

        int beforeRound = (int) (num/(Math.pow(10,round) ));
        beforeRound = (int)(beforeRound * (Math.pow(10,round)));

        int atDigit = (int) (digitToRoundedNumber/(Math.pow(10, round-1)));
        if(atDigit < 5){
            num = (beforeRound + digitToRoundedNumber) / Math.pow(10,numberOfDecimalValues);
        }
        else {
            beforeRound =(int) (beforeRound + (Math.pow(10,round) ));
            num = (beforeRound + digitToRoundedNumber) / Math.pow(10,numberOfDecimalValues) ;
        }
        return num;
    }

    public static void main(String[] args) {

        Round obj = new Round();
        double roundNum = obj.roundOff(104.3 , 1);
        System.out.println(roundNum);
    }
}
