package com.programming.dst.arrays;

public class Merge_23_june_2019 {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
    }


    public static int[] merge(int[] array1,int[] array2) {
        int[] resultArray  = new int[array1.length+array2.length];
        int k=0;
        for (int i=0;i<array1.length;i++){
            resultArray[k++] = array1[i];
        }
        for (int i=0;i<array2.length;i++){
            resultArray[k++] = array2[i];
        }
        return resultArray;
    }

}

