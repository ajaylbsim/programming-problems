package com.programming.dst.arrays;

import com.programming.dst.util.Display;

import java.util.Arrays;

public class Rotate_22_june_2019 {


    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9};
        ;
       // Display.print(rightRotate(array, 2), "Right rotataion");

        Display.print(rightRotateSubArray(array, 1,1,3), "Right rotataion");


    }


    public static int[] rotate(int[] array, int rotationFator) {

        if(rotationFator>array.length) rotationFator = rotationFator%array.length;

        int a1[] = new int[array.length];

        int result[] = new int[array.length];


        a1 = Arrays.copyOfRange(array, 0, rotationFator);

        result = Arrays.copyOfRange(array, rotationFator, array.length);
        //a1= reverse(a1);
       // result= reverse(result);

        result =Merge_23_june_2019.merge(result,a1);



        return result;
    }


    public static int[] rightRotate(int[] array, int rotationFator) {
        if(rotationFator>array.length) rotationFator = rotationFator%array.length;
        int a1[] = new int[array.length];
        int result[] = new int[array.length];
        a1 = Arrays.copyOfRange(array, array.length-rotationFator, array.length);
        result = Arrays.copyOfRange(array, 0, array.length-rotationFator);
        result =Merge_23_june_2019.merge(a1,result);
        return result;
    }





    public static int[] rightRotateSubArray(int[] array, int rotationFator,int startIndex,int endIndex) {

        int lengthofArary = endIndex-startIndex+1;

        if(rotationFator>lengthofArary) rotationFator = rotationFator%lengthofArary;
        int a1[] = new int[array.length];
        int result[] = new int[array.length];
        a1 = Arrays.copyOfRange(array, lengthofArary-rotationFator, lengthofArary);
        result = Arrays.copyOfRange(array, startIndex, lengthofArary-rotationFator);
        result =Merge_23_june_2019.merge(a1,result);
        return result;
    }


    private static int[] reverse(int[] array) {
        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public  static  int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }

}

