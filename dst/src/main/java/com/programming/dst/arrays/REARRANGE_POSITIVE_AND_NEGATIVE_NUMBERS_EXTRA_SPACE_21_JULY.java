package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REARRANGE_POSITIVE_AND_NEGATIVE_NUMBERS_EXTRA_SPACE_21_JULY {

    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4,
                5, 6, -7, 8, 9};

        Display.print(rearraange(array), "Afer arragement :- ");
    }


    private static int[] rearraange(int arr[]) {

        int i = -1;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] < 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }
}