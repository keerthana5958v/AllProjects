package org.example;

public class AnagramUsingFrequency {
    public static void main(String[] args) {
        AnagramUsingFrequency obj = new AnagramUsingFrequency();
        String a = "silent";
        String b = "listen";
        boolean isAnagram  = (obj.isAnagram(a,b));
        if(isAnagram){
            System.out.println("it is an anagram");
        }
        else{
            System.out.println("it is not an anagram");
        }
    }
    boolean isAnagram(String a, String b){
        int a1 = 0;
        int a2 = 0;
        if(a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {
                a1 += a.toLowerCase().charAt(i);
                a2 += b.toLowerCase().charAt(i);
            }
            return (a1==a2);
        }
        return false;
    }
}
