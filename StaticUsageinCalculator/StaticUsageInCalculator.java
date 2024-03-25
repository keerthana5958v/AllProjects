public class StaticUsageInCalculator {
    public static void main(String[] args) {
        System.out.println(StaticUsageInCalculator.mean(2,3,4));
        System.out.println(StaticUsageInCalculator.findMin(2,3,4));
        System.out.println(StaticUsageInCalculator.findMax(2,3,4));
        System.out.println(StaticUsageInCalculator.findMinSqrt(2,3));
        System.out.println(StaticUsageInCalculator.findMaxSqrt(2,3));
    }
    public static double mean(int num1, int num2, int num3){
        int mean = (num1 + num2 + num3)/3;
        return mean;
    }
    public static int findMin(int num1, int num2, int num3){
        int minimum1= Math.min(num1,num2);
        int minimum2= Math.min(minimum1,num3);
        return Math.min(minimum1,minimum2);
    }
    public static int findMax(int num1, int num2, int num3){
        int maximum1= Math.max(num1 ,num2);
        int maximum2= Math.max(maximum1,num3);
        return Math.max(maximum1,maximum2);
    }
    public static double findMinSqrt(int num1, int num2){
        return Math.sqrt(Math.min(num1,num2));
    }
    public static double findMaxSqrt(int num1, int num2){
        return Math.sqrt(Math.max(num1,num2));
    }
}