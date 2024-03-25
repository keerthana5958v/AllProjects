package org.example;

public class MinimumCommonValue {
    private Integer[] arr;

    public MinimumCommonValue(Integer[] arr){
        this.arr=arr;
    }
    int maximumNumber(){
        int maxNumber=arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>maxNumber) {
                maxNumber = arr[i];
            }

        }
        return maxNumber;
    }
    Integer minimumNumber(){
        int smallestNumber=arr[0];
        int maxNum = maximumNumber();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<=smallestNumber) {
                smallestNumber = arr[i];
                arr[i]= maxNum;
            }

        }
        return smallestNumber;
    }
    public String toString(){
        String res ="";
        for(int i = 0 ; i < arr.length ; i++){
            res+= arr[i]+" ";
        }
        return res;
    }

    public static void main(String[] args) {
        MinimumCommonValue arr1 = new MinimumCommonValue(new Integer[]{1,2,3,6});
        MinimumCommonValue arr2 = new MinimumCommonValue(new Integer[]{2,4,6,7});
        int min1 = arr1.minimumNumber();
        int min2 = arr2.minimumNumber();
        int count = 0;
        while(min1!=min2){
            min1 = arr1.minimumNumber();
            System.out.println(arr1);
            System.out.println(arr2);
            count++;
            if(count==arr1.arr.length){
                count=0;
                break;
            }
        }
        System.out.println(min1 +" "+ min2);
    }
}
