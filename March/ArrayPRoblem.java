package org.example;

public class ArrayPRoblem {
    public static void main(String[] args) {
        int[] arr = new int[]{2,-5,6,-7,-3,-2,4,9,4};
        new ArrayPRoblem().transformArray(arr);

    }
    void transformArray(int[] arr){
        int[] ar = new int[arr.length];
        int[] evenArray = evenArray(arr);
        int[] oddArray = oddArray(arr);
        int idx = 0;
        int idx2 = 0;
        int i = 0;
        for( ; i < arr.length; i++){
            if(i%2==0) {
                ar[i] = evenArray[idx];
                idx++;
            }
            else {
                ar[i] = oddArray[idx2];
                idx2++;
            }
            if(idx==evenArray.length || idx2 == oddArray.length)break;

            System.out.print(ar[i]+" ");
        }

    }

    int[] oddArray(int[] arr){
        int[] oddArray = new int[arr.length];
        int currentIdx = 0;
        for(int i = 0 ; i < oddArray.length ; i++){
            if(arr[i]<0){
                oddArray[currentIdx]=arr[i];
                currentIdx++;
            }
        }
        int[] oddNums = new int[currentIdx+1];
        for(int i = 0 ; i < oddNums.length ; i++)oddNums[i]=oddArray[i];
        return oddNums;
    }
    int[] evenArray(int[] arr){
        int[] evenArray = new int[arr.length];
        int currentIdx = 0;
        for(int i = 0 ; i < evenArray.length ; i++){
            if(arr[i]>0){
                evenArray[currentIdx]=arr[i];
                currentIdx++;
            }
        }
        int[] evenNums = new int[currentIdx+1];
        for(int i = 0 ; i < evenNums.length ; i++)evenNums[i]=evenArray[i];
        return evenNums;
    }

}
