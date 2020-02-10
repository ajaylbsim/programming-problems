package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REORDER_AN_ARRAY_ACCORDING_TO_GIVEN_INDEXES {


    public static void main(String[] args) {


//        int arr[] = {50, 40, 70, 60, 90};
//        int index[] = {3, 0, 4, 1, 2};

        int arr[]   = {50, 40, 70, 60, 90};
      int  index[] = {3,  0,  4,  1,  2};

        //new REORDER_AN_ARRAY_ACCORDING_TO_GIVEN_INDEXES().reorder(arr, index, arr.length);

        reorderBYMe(arr, index);


    }


    private static int[] reorderBYMe(int[] arr, int[] indexArray) {


        for (int i = 0; i < arr.length; i++) {


            while (indexArray[i] != i) {
                System.out.println(arr[i]);

                int oldIndex = indexArray[indexArray[i]];
                int oldIndexVal = arr[indexArray[i]];

                arr[indexArray[i]] = arr[i];
                indexArray[indexArray[i]] = indexArray[i];

                indexArray[i] = oldIndex;
                arr[i] = oldIndexVal;

            }

        }

        Display.print(arr, "After insertion");
        Display.print(indexArray, "After insertion");


        return arr;
    }


    void reorder(int arr[], int index[], int n) {

        int pass = 0;

        Display.print(arr, "\narray after pass " + pass);
        Display.print(index, " \n index after pass " + pass);

        // Fix all elements one by one
        for (int i = 0; i < n; i++) {
            // While index[i] and arr[i] are not fixed
            while (index[i] != i) {
                pass++;
                // Store values of the target (or correct)
                // position before placing arr[i] there
                int oldTargetI = index[index[i]];
                int oldTargetE = arr[index[i]];

                // Place arr[i] at its target (or correct)
                // position. Also copy corrected index for
                // new position
                arr[index[i]] = arr[i];
                //System.out.println(" index[i]"+index[i] +" --"+arr[i]);
                index[index[i]] = index[i];

                Display.print(arr, "\narray after pass " + pass);
                Display.print(index, " \n index after pass " + pass);


                // Copy old target values to arr[i] and
                // index[i]
                index[i] = oldTargetI;
                arr[i] = oldTargetE;


                Display.print(arr, "\narray after pass " + pass);
                Display.print(index, " \n index after pass " + pass);


            }
        }
    }


}
