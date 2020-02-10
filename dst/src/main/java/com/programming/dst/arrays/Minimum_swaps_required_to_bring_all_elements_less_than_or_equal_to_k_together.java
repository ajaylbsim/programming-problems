package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class Minimum_swaps_required_to_bring_all_elements_less_than_or_equal_to_k_together {


    public static void main(String[] args) {

        int arr[] = {2, 1, 5, 6, 3}, k = 3;

        //int arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5;
        int count = new Minimum_swaps_required_to_bring_all_elements_less_than_or_equal_to_k_together().swapCount(arr, k);
        System.out.println("------  " + count);
    }

    private int swapCount(int arr[], int k) {
        int count = 0;
        int i = 1;
        int j = arr.length - 1;


        while (((i < j))) {
            System.out.println("i -" + i);
            System.out.println("j" + j);

            if (arr[i] <= k) {
                i++;
            }
            if (arr[j] > k) {
                j--;
            }

            if ((arr[i] > k) && (arr[j] <= k)) {
                System.out.println(" swapped " + i + j);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = i + 1;
                j = j - 1;
                count++;

                System.out.println(" swapped " + i + j);

            }
        }

        return count;
    }
}
