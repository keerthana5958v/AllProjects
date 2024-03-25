public class stringConcatenation {
    String name= "John";
    int age=45;
    double interest= 14.35;
    boolean result=true;
    char gender= 'm';
    char c1 ='A';

    char c2 ='B';
    public static void main(String[] args) {
        stringConcatenation obj = new stringConcatenation();
        obj.concatString();
    }
    public void concatString(){
        System.out.println(name+","+age);
        System.out.println(name+",interest -->"+interest);
        System.out.println(name+", and you solved puzzle ="+interest);
        System.out.println(name+", gender is-->"+ gender);
        System.out.println("The result is -->"+(c1+c2));
        System.out.println("The result is -->"+c1+c2);
    }
}