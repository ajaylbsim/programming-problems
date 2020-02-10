package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REARRANGE_ARRAY_IN_ALTERNATING_POSITIVE_NEGATIVE_ITEMS_WITH_21_july {

    public static void main(String[] args) {

      int[] array = {1, 2, 3, -4, -1, 4};
        //int[] array = {1, 2, 3, -4};


        rearrage(array);
        // Display.print(rearraange(array), "Afer arragement :- ");

    }

    private static void rearrage(int[] array) {

        int posIndex = 0, negativeIndex = 0;

        for (int i = 0; i < array.length;i++) {

            System.out.println(" strting at"+i);
            String k = i % 2 == 0 ? (array[i] > 0 ? "mis matched  at " + i : "") : (array[i] < 0 ? "mis matched  at " + i : "");

            if (i % 2 == 0) {
                while (array[i] > 0) {
                    i++;
                }
                posIndex = i;

                ;
            } else {

                while (array[i] < 0) {
                    i++;
                }
                ;
                negativeIndex = i;
            }

            if((posIndex<array.length) &&(negativeIndex<array.length)) {
                System.out.println(" posIndex " + posIndex + " negativeIndex" + negativeIndex);
                Display.print(Rotate_22_june_2019.rightRotateSubArray(array,1,negativeIndex,posIndex),"----");

                negativeIndex =posIndex=array.length+6;
                //i++;
            }

        }


    }


}
