package com.programming.dst.arrays;

public class Find_Pivot_Ins_Rotated_23_june_2019 {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySerach(array, 9, 0, array.length - 1));

    }



    private static Boolean findPivot(int[] array, int key, int low, int high) {
        System.out.println(">>>>>>>>> low {} high {}" + low + high);
        if (low > high) {
            System.out.println(">>>>>>>>> low {} high {}" + low + high);
            return Boolean.FALSE;
        }

        int mid = (low + high) / 2;

        if (key == array[mid]) return Boolean.TRUE;

        if (key < array[mid])
            binarySerach(array, key, 0, mid - 1);
        else
            binarySerach(array, key, mid + 1, high);


        return Boolean.FALSE;
    }

    private static Boolean binarySerach(int[] array, int key, int low, int high) {
        System.out.println(">>>>>>>>> low {} high {}" + low + high);
        if (low > high) {
            System.out.println(">>>>>>>>> low {} high {}" + low + high);
            return Boolean.FALSE;
        }

        int mid = (low + high) / 2;

        if (key == array[mid]) return Boolean.TRUE;

        if (key < array[mid])
            binarySerach(array, key, 0, mid - 1);
        else
            binarySerach(array, key, mid + 1, high);


        return Boolean.FALSE;
    }
}
