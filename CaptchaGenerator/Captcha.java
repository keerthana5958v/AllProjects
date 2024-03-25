import java.util.Random;

public class Captcha {
    public static void main(String[] args) {
        CaptchaGenerator c = new CaptchaGenerator();
        System.out.println(c.introToUser());
        c.generateIndex();
    }
}

class CaptchaGenerator {
    int captchaLength;
    String captcha = "";
    String alphaNumeric = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random rand = new Random();
    StringBuilder newSb = new StringBuilder();
    public String introToUser(){
        String introduction= "This a program to generate random captcha";
        return introduction;
    }

    public int generateLength() {
        return captchaLength = rand.nextInt(4)+4;
    }

    public String generateIndex() {
        int captchaLength = generateLength();

        for (int i = 0 ; i < captchaLength ; i++) {
            char captchaCharacter = alphaNumeric.charAt(rand.nextInt(alphaNumeric.length()));
            System.out.print(captchaCharacter);
            newSb.append(captchaCharacter);
        }
        captcha = newSb.toString();
        return captcha;
    }
}

