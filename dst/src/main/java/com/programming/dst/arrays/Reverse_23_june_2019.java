package com.programming.dst.arrays;

public class Reverse_23_june_2019 {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //reverse(array);
        reverseSubArarry(array, 2, array.length - 1);
    }


    private static int[] reverse(int[] array) {

        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",  ");
        }
        return array;
    }


    public static int[] reverseSubArarry(int[] array, int start, int end) {
        int length = end - start + 1;
        int mid = start + (length / 2);
        int counter = 1;
        int base = mid;
        if (length % 2 != 0) mid = mid + 1;
        while (mid <= end) {
            int temp = array[mid];
            array[mid] = array[base - counter];
            array[base - counter] = temp;
            mid++;
            counter++;

        }
        return array;
    }


}

