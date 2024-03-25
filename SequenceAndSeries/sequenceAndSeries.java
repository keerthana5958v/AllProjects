import java.util.Scanner;
public class sequenceAndSeries {
    public static void main(String [] args){
        sequenceAndSeries series = new sequenceAndSeries();
        series.arithmeticSeries();
        series.geometricSeries();
    }
            int startNumber = 0;

            public void arithmeticSeries() {
                Scanner in = new Scanner(System.in);
                System.out.println("enter the value of starting number for arithmetic series-->");
                int a = in.nextInt();
                System.out.println("enter the value of difference number for arithmetic series-->");
                int d = in.nextInt();
                System.out.println(a +" " +(a + d) +" "+ (a + 2 * d));

            }
            public void geometricSeries(){
                Scanner in = new Scanner(System.in);
                System.out.println("enter the value of starting number for geometric series-->");
                int n = in.nextInt();
                System.out.println("enter the value of difference number for geometric series-->");
                int r = in.nextInt();
                System.out.println(n+" "+(n*r)+" "+(n*r*r));
            }
}

