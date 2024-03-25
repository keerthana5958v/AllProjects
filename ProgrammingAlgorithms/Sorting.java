import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(selectionSort(list)));
    }
    static int[] list = new int[]{2,4,2,5,9,21,6,12};

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0 ; i < list.length ; i++){
            if(i != list.length-1) {
                s += list[i] + ",";
            }
            else{
                s += list[i];
            }
        }
        s += "]";
        return s;
    }
    public static int[] selectionSort(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j< a.length ; j++){
                if(a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

//    public static int[] bubbleSort(int[] a){
//        for (int i = 0 ; i < a.length ; i++){
//
//        }
//    }
}


