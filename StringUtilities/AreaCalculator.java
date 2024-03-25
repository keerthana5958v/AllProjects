public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("area of circle: "+AreaCalculator.areaOfCircle(7)+"units");
        System.out.println("area of square: "+AreaCalculator.areaOfSquare(6)+"units");
        System.out.println("area of rectangle: "+AreaCalculator.areaOfRectangle(11, 5)+"units");
        System.out.println("area of triangle: "+areaOfTriangle(5, 9)+"units");
    }
    public static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
    public static double areaOfSquare(double side){
        return side*side;
    }
    public static double areaOfRectangle(double length, double width){
        return length * width;
    }
    public static double areaOfTriangle(double base , double height){
        return 0.5 * base * height;
    }
}