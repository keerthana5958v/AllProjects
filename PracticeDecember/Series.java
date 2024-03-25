package org.example;

import java.util.Arrays;

public class Series {
    int[] originalSeries(){
        int range = 100;
        int[] arr = new int[range];
        for(int i = 0 ; i < range ; i++){
            arr[i] = i+1;
        }
        return arr;
    }
    int[] sumOfSeries(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            if(arr[i]<=9){
                sum = arr[i];
            }
            if(arr[i]>9 && arr[i]<100){
                String temp = String.valueOf(arr[i]);
                sum =  Integer.parseInt(temp.charAt(0)+"") + Integer.parseInt(temp.charAt(1)+"");
            }
            if(arr[i]==100){
                sum=1;
            }
            arr2[i] = sum;
        }
        return arr2;
    }
    int[] reversedArr(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i = arr.length-1 ; i >= 0 ; i--){
            arr2[arr.length-i-1] = arr[i];
        }
        return arr2;
    }
    int[] multiplyTwoArrays(int[] arr1 , int[] arr2){
        int[] res = new int[Math.min(arr1.length, arr2.length)];
        for(int i = 0 ; i < res.length ; i++){
            res[i] = arr1[i]*arr2[i];
        }
        return res;
    }
//    iff multiplied arr in original array print the elements

    int[] isOriginalNumber(int[] original , int[] arr){
        int[] newArr = new int[Math.min(original.length, arr.length)];
        for(int i = 0 ; i < Math.min(original.length, arr.length) ; i++){
            if(arr[i]<=100){
                newArr[i]=arr[i];
            }
        }
        Arrays.sort(newArr);
        int numberOfDuplicates = 0;
        int index = 0;
        for(int i = 0 ; i < newArr.length -1  ; i++){
            if(newArr[i]==newArr[i+1]){
                numberOfDuplicates++;
            }
        }
        int[] res = new int[Math.min(original.length, arr.length)-numberOfDuplicates];
        for (int i = 0; i < newArr.length ; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (newArr[i] == newArr[i+1]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                res[index] = newArr[i];
                index++;
                if (index == res.length) {
                    break;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Series obj = new Series();
        int[] originalSeries = obj.originalSeries();
        int[] sumOfSeries = obj.sumOfSeries(originalSeries);
        int[] reversed = obj.reversedArr(originalSeries);
        int[] multipliedArr = obj.multiplyTwoArrays(sumOfSeries,reversed);

//        int[] isOriginal = obj.isOriginalNumber(originalSeries , multipliedArr);

        System.out.println("original series");
        System.out.println(Arrays.toString(originalSeries));
        System.out.println("sum of series ");
        System.out.println(Arrays.toString(sumOfSeries));
        System.out.println("reversed");
        System.out.println(Arrays.toString(reversed));
        System.out.println("multiplied array");
        System.out.println(Arrays.toString(multipliedArr));
//        System.out.println("elements present in original");
//        System.out.println(Arrays.toString(isOriginal));

    }
}
