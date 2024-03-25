package org.example;
import java.util.Random;
public class Problem {
    public int randomNumberGenerator(int min, int max){
        return (new Random().nextInt(max-min)+min);
    }
    private int lengthOfCaptcha(){
        return randomNumberGenerator(4,7);
    }
    public String generateCaptcha(){
        String characters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        StringBuilder sb = new StringBuilder();
        int count=0;
        int length = lengthOfCaptcha();
        while(count<length){
            count++;
            sb.append(characters.charAt(randomNumberGenerator(0,characters.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem obj = new Problem();
        System.out.println(obj.generateCaptcha());
    }

}
