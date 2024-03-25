import java.util.Scanner;
public class unitConverter {
    double pound=0;
    double kilo=0;

    public void poundToKilo(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the weight in pounds-->");
        double pound= obj.nextDouble();
        double kilo = (pound/2.2);
        System.out.println("weight in kilo-->"+kilo);

    }
    public void kiloToPound(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the weight in kilo-->");
        double kilo= obj.nextDouble();
        double pound = (kilo*(2.2));
        System.out.println("weight in pounds-->"+pound);
    }
    public static void main(String[] args) {
        unitConverter unit = new  unitConverter();
        unit.poundToKilo();
        unit.kiloToPound();
    }

}