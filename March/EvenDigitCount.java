package org.example;

public class EvenDigitCount {
    public static void main(String[] args) {
        EvenDigitCount obj = new EvenDigitCount();
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.print("your number --> ");
        for(int i = 0 ; i < nums.length ;i++) System.out.print(nums[i]+", ");
        System.out.println("\ncount of numbers with even digits --> "+obj.countOfEvenDigits(nums));
    }
    int countOfEvenDigits(int[] nums){
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(getNumberOfDigits(nums[i])%2==0)count++;
        }
        return count;
    }
    int getNumberOfDigits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }

}
