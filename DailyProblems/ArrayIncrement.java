package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIncrement {
    int getNextNum(int[] num){
        int n = 0;
        for(int i = 0 ; i < num.length ; i++){
            n = n*10 + num[i];
        }
        n++;
        return n;
    }
    int getNumberOfDigits(int n){
        int temp = n;
        int numOfDigits = 1;
        while(temp>=10){
            temp = temp/10;
            numOfDigits++;
        }
        return numOfDigits;
    }
    int[] createNewArr(int n, int numOfDigits){
        int[] num = new int[numOfDigits+1];
        int count = 0;
        while(count<num.length){
            num[num.length - 1 -count] = (int) ((n % Math.pow(10, count+1) - (n % Math.pow(10, count)))  / Math.pow(10, count));
            count++;
        }
        return num;
    }
    void printArr(int[] num){
        for(int i = 0 ; i < num.length; i++){
            if(i ==0 )System.out.print("[ ");
            else if(i == num.length-1) System.out.print(num[i]+ " ]");
            else System.out.print(num[i]+", ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int[] num;
        ArrayIncrement obj = new ArrayIncrement();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        System.out.println(n);
        num = obj.createNewArr(n, obj.getNumberOfDigits(n));
        obj.printArr(num);
        n = obj.getNextNum(num);
        num = obj.createNewArr(n, obj.getNumberOfDigits(n));
        obj.printArr(num);
    }
}


