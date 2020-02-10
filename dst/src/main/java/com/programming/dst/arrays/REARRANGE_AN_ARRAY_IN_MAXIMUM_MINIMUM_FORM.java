package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REARRANGE_AN_ARRAY_IN_MAXIMUM_MINIMUM_FORM {

    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr[] = {1, 20, 30, 40, 55, 67};

        Display.print(arrangeInOrderOne(arr), "After arrange");
    }


    private static int[] arrangeInOrderOne(int[] arr) {
        int n=arr.length;
        int max_idx = n - 1, min_idx = 0;

        // store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put maximum element
            if (i % 2 == 0) {

                System.out.println( max_elem);
                System.out.println(arr[max_idx] % max_elem);


                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }

            // at odd index : we have to put minimum element
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }
//
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;

        return arr;

}


    private static int[] arrange(int[] arr) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int[] arr2 = new int[arr.length];
        int count = 0;
        while (minIndex < maxIndex) {
            arr2[count++] = arr[maxIndex];
            arr2[count++] = arr[minIndex];
            maxIndex--;
            minIndex++;
        }

        if (count < arr.length) {
            arr2[count++] = arr[minIndex];
        }
        return arr2;
    }


}
