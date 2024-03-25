import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("number-->");
        int a = s.nextInt();
//        s.nextLine();
        System.out.println("string-->");
        String str = s.nextLine();

        System.out.println(a);
        System.out.println(str);
    }
}
