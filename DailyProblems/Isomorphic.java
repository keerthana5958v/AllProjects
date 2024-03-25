package org.example;

import java.util.Scanner;

public class Isomorphic {
    boolean hasUniqueCharacters(String str){
        if(str.isEmpty()){return false;}
        for (int i = 0; i < str.length() ; i++){
            for (int j = 0; j < i; j++){
                if (str.charAt(j) == str.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    int uniqueCharIndex(int index, String str){
        for(int i = index -1 ; i >=0 ; i--){
            if(str.charAt(index)==str.charAt(i))return i;
        }
        return -1;
    }
    boolean isIsometric(String s1, String s2){
        if(s1.length() != s2.length())return false;
        if(hasUniqueCharacters(s1)&&hasUniqueCharacters(s2))return true;
        for(int i = 0 ; i < s1.length() ; i++) {
            int uniqueChar1 = uniqueCharIndex(i, s1);
            int uniqueChar2 = uniqueCharIndex(i, s2);
            if (uniqueChar1 != uniqueChar2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Isomorphic obj = new Isomorphic();
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count<3) {
            count++;
            System.out.println("enter string 1 -->");
            s1 = sc.next();
            System.out.println("enter string 2 -->");
            s2 = sc.next();

            if (obj.isIsometric(s1, s2)) System.out.println("it is isometric");
            else System.out.println("it is not isometric");
            System.out.println();
        }
    }
}

