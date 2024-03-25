public class StaticVariableWorkout {
    static int num1=34;
    static int num2=52;
    static int num3=25;

    public static void main(String[] args) {
        StaticVariableWorkout obj = new StaticVariableWorkout();
        System.out.println("largest of three numbers "+ obj.calculatingMaximumOfThreeNumbers(num1,num2,num3));
        System.out.println("smallest of three numbers "+ obj.calculatingMinimumOfThreeNumbers(num1,num2,num3));
        System.out.println("smallest of three numbers(method overloading) :"+ obj.calculatingMinimumOfThreeNumbers());
    }
    public int calculatingMaximumOfThreeNumbers(int a, int b, int c){
        int maximum1= Math.max(a,b);
        int maximum2= Math.max(b,c);
        int largestOfThree = Math.max(maximum1,maximum2);
        return largestOfThree;
    }

    public int calculatingMinimumOfThreeNumbers(int a , int b , int c){
        int minimum1= Math.min(a,b);
        int minimum2= Math.min(b,c);
        int smallestOfThree = Math.min(minimum1,minimum2);
        return smallestOfThree;
    }
    public int calculatingMinimumOfThreeNumbers(){
        int minimum1= Math.min(num1,num2);
        int minimum2= Math.min(num2,num3);
        int smallestOfThree = Math.min(minimum1,minimum2);
        return smallestOfThree;
    }
    public int findMinimum(int a, int b){
        return Math.max(a, b);

    }
    public int findMinimum(int a, int b, int c){
        int n1 = Math.max(a, b);
        int n2 = Math.max(n1, c);
        return Math.max(n1, n2);

    }
    public float findMinimum(float a , float b){

    }
    public void display(){
        System.out.println("Hello");
    }
    public void display(int x){
        System.out.println("Number is : "+ x);
    }
}