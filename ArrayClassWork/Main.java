import java.util.Arrays;

public class Main {
    private int[] arrayNumber;
    public Main(){
//        arrayNumber = new int[5];
        arrayNumber= new int[]{12, 42, 25, 31, 67};
    }
    public Main(int[] arr){
        arrayNumber = arr;
//        arr = new int[]{23, 43, 25, 56, 15};
    }
    public int findMin(){
        Arrays.sort(arrayNumber);
        return arrayNumber[0];
    }
    public int findMax(){
        int maxValue = 0;
        for(int i=0; i<arrayNumber.length; i++){
            if (maxValue < arrayNumber[i]){
                maxValue = arrayNumber[i];
            }
        }
        return maxValue;
    }
    public int sum(){
        int sum = 0;
        for (int i =0; i< arrayNumber.length; i++){
            sum += arrayNumber[i];
        }
        return sum;
    }
    public boolean isExist(int data){
        return (Arrays.asList(arrayNumber).contains(data));
    }
    public void display(){
        for (int i=0;i< arrayNumber.length;i++){
            System.out.println(arrayNumber[i]);
        }
    }
    public int indexOf(int index){
        return arrayNumber[index];
    }
    public boolean isOddOfSumOfArray(){
        return sum()%2==1;
    }
    public boolean isEvenOfSumOfArray(){
        return sum()%2==0;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("minimum: "+obj.findMin());
        System.out.println("maximum: "+obj.findMax());
        System.out.println("sum: "+obj.sum());
        System.out.println("is Exist: "+obj.isExist(5));
        obj.display();
        System.out.println("index of 2: "+obj.indexOf(2));
        System.out.println("even sum of array: "+obj.isEvenOfSumOfArray());
        System.out.println("odd sum of array: "+obj.isOddOfSumOfArray());
    }
}