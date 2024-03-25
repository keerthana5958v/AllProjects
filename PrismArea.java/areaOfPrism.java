import java.util.Scanner;
public class areaOfPrism {
    public static void main(String [] args){
        areaOfPrism area = new areaOfPrism();
        area.prismArea();
    }
    int startNumber = 0;

    public void prismArea() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of length-->");
        int l = in.nextInt();
        System.out.println("enter the value of width-->");
        int w = in.nextInt();
        System.out.println("enter the value of height-->");
        int h = in.nextInt();
        System.out.println("the area of prism--> "+ (2*((l*w)+(w*h)+(h*l))));
    }
}

