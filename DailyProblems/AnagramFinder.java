package org.example;

import java.util.Scanner;

/*
    Program 3:
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

    Input: s = "silent", t = "listen"
    Output: true

    Input: s = "rat", t = "art"
    Output: true

    Input: s = "hat", t = "cat"
    Output: false;

    Input: s = "plain" ,  t = "plane";
    Output: false;
 */
public class AnagramFinder {
    String sortString(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char temp = ' ';
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length ; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    boolean compareString(String s1, String s2){
        return sortString(s1).equals(sortString(s2));
    }


    public static void main(String[] args) {
        AnagramFinder obj = new AnagramFinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1");
        String s1 = sc.nextLine();
        System.out.println("enter string 1");
        String s2 = sc.nextLine();
        System.out.println(obj.compareString(s1,s2));

    }
}
