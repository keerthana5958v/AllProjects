package org.example;

public class Subset {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int idx = arr.length / 2;
        int[][] subset = new int[(int) Math.pow(arr.length, 3)][];
        for (int i = 0; i < arr.length; i++) {
            subset[i] = new int[]{arr[i]};
        }

    }
}