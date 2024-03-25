package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckWord {
    String word = "addddiieu";
    int limit = 6;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CheckWord obj = new CheckWord();
        String input = sc.nextLine();
        if(obj.isEqualLength(input)){
            System.out.println("num of recurring words  "+obj.recurringWords().length());
            System.out.println("recurring chars -->"+obj.recurringWords());
        }
        else {
            System.out.println("else block");
        }
    }
    boolean isEqualLength(String input){
        return word.length()==input.length();
    }


    String recurringWords(){
        StringBuilder sb = new StringBuilder();
        if(!word.isEmpty()) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }




}
