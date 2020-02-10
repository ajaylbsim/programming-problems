package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class Serach_in_sorted_rotated_23_june_2019 {


    public static void main(String[] args) {

        int searchKey = 6;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Display.print(array, "Display before rotation : - ");
        array = Rotate_22_june_2019.rotate(array, 3);
        Display.print(array, "Display after rotation : - ");
//        Boolean serachResult = BinarySerach_23_june_2019.binarySerach(array, searchKey, 0, array.length - 1);
//        System.out.println("\n search for  key is found " + searchKey + "   " + serachResult);

    }


}
