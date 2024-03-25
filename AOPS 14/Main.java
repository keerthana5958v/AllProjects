import java.util.Arrays;

public class Main {
    static int[] a =  new int[]{1,2,3,4,5};
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.toString(a));
        for(int i = 0 ; i < a.length ; i++){
            a[i] = a[i]*10;
        }
        System.out.println(obj.toString(a));
    }
    public String toString(int[] a){
        String temp = "[ ";
        for(int i = 0 ; i < a.length ; i++){
            if(i != a.length - 1){
                temp += a[i] + " , ";
            }
            else{
                temp += a[i];
            }
        }
        temp += " ]";
        return  temp;
    }
}