package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REARRANGE_POSITIVE_AND_NEGATIVE_NUMBERS_WITH_CONSTANT_EXTRA_SPACE_28_JULy {

    public static void main(String[] args) {
        System.out.println("teee");
        int arr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        reArrange(arr);
        Display.print(arr, "After arrangement");
    }


    private static int[] reArrange(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int val = arr[i];

            if (arr[i] > 0) continue;

            int j = i - 1;
            while ((j >= 0) && (arr[j] > 0)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;


        }

        return arr;
    }
}
