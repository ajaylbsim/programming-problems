package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class Pair_of_sum_In_Rotated_sorted_Array_23_june_2019 {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Display.print(array, " Before rotation ");
        array = Rotate_22_june_2019.rotate(array, 36);
        Display.print(array, " \n After rotation ");
        //System.out.println("\n>>>>>>>>>>Pivot element is >>>>>  "+FindPivot(array));
        //System.out.println("\n>>>>>>>>>>Pivot element is >>>>>  "+array[Pivot_In_Rotated_Array_23_june_2019.findPivot(array,0,array.length)]);
        System.out.println("\n>> findSumIfExists(array,11" + findSumIfExists(array, 9));
    }

    public static Boolean findSumIfExists(int[] array, int x) {
        int pivot = 0;

        for (pivot = 0; pivot < array.length; pivot++) {
            if (array[pivot] > array[pivot + 1]) break;
        }
        int l = pivot + 1, r = pivot, count = 0, n = array.length, marker = 0;


        while (l != r) {
            System.out.println("  l  r" + l + r);
            int sum = (array[l] + array[r]);
            System.out.println(" sum is " + sum);
            if (sum == x) count++;

            if ((array[l] + array[r]) > x) {
                l = (l + 1) % n;
            } else {
                r = ((r - 1) + n) % n;
            }
            marker++;
            if (marker > 1000) break;
        }


        System.out.println(" count is " + count);


        return Boolean.FALSE;
    }

}
