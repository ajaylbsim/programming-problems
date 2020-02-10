package com.programming.dst.arrays;

import java.util.Arrays;

public class Cyclic_Rotation_23_june_2019 {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = rotate(array, array.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }


    private static int[] rotate(int[] array, int n) {
        int temp = array[n - 1];
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;


        return array;
    }
}
