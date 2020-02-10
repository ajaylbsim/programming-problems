package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REVERSAL_ALGORITHM_FOR_RIGHT_ROTATION_OF_AN_ARRAY_20_JULY {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rightRotate(arr,3);

    }


    public static int[] rightRotate(int[] arary, int ratationfactor) {

        Reverse_23_june_2019.reverseSubArarry(arary, 0, arary.length-1);
        Reverse_23_june_2019.reverseSubArarry(arary, 0, ratationfactor-1);
        Reverse_23_june_2019.reverseSubArarry(arary, ratationfactor , arary.length-1);
        Display.print(arary, "Afer right rotation");
        return arary;
    }
}
