package org.example;

import java.util.Arrays;

public class ExtraCharacterInString {
    public static void main(String[] args) {
        String s = "wlecome";
        String t = "wlecomed";
        char[] a =  s.toCharArray();
        char[] b =  t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length == b.length-1 || b.length == a.length-1){
            int min = Math.min(a.length,b.length);
            for(int i = 0 ; i < min; i++){
                if(a[i]!=b[i]) {
                    System.out.println(b[i]);
                    break;
                }
            }


        }

    }

}
