import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class CaptchaGenerator {
    String captcha = "";
    String alphaNumeric = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random rand = new Random();
    static int CaptchaCount = 0;

    public int generateLength() {
        return rand.nextInt(4)+4;
    }

    public String generateCaptcha(String contents, int captchaLength) {
        StringBuilder newSb = new StringBuilder();
        for (int i = 0 ; i < captchaLength ; i++) {
            char captchaCharacter = contents.charAt(rand.nextInt(contents.length()));
            newSb.append(captchaCharacter);
        }
        captcha = newSb.toString();
        return captcha;
    }
    public String getCaptchaFromUser(){
        Scanner sc = new Scanner(System.in);
        CaptchaCount++;
        if(CaptchaCount==1) {
            System.out.println("Enter the above captcha");
        }
        else {
            System.out.println(ConsoleColors.RED+"Verification failed. Please try again."+ConsoleColors.YELLOW+"\nRe-enter the above captcha "+ConsoleColors.RESET);
        }
        String userCaptcha = sc.nextLine();
        System.out.println();
        return userCaptcha;
    }

    public void getValidCaptcha(){
        System.out.println(ConsoleColors.CYAN+"\nPlease enter the below captcha to verify that you are human. "+ConsoleColors.RESET);
        String userCaptcha;
        String SystemCaptcha;
        do{
            SystemCaptcha = generateCaptcha(alphaNumeric,generateLength());
            System.out.println(ConsoleColors.CYAN_BOLD+">  "+ConsoleColors.RESET+SystemCaptcha);
            userCaptcha = getCaptchaFromUser();
        }while(!Objects.equals(SystemCaptcha, userCaptcha));
        System.out.println(ConsoleColors.GREEN_BOLD+"Verification successful.\n"+ConsoleColors.RESET);

    }

    public static void main(String[] args) {
        CaptchaGenerator obj = new CaptchaGenerator();
        obj.getValidCaptcha();
    }
}
