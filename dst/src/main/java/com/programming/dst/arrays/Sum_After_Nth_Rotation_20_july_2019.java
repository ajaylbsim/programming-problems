package com.programming.dst.arrays;

import com.programming.dst.util.Display;

import java.util.Arrays;

public class Sum_After_Nth_Rotation_20_july_2019 {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4};
        int myarray[] = new int[array.length];
        int RiMinus1= getSum(array);
        int arraySum= getSumArary(array);
        int maxSum = RiMinus1;
        for (int i=1;i<=array.length;i++){
            System.out.println(i-1 +"=currentSum "+RiMinus1 +"-  "+maxSum);
        myarray = Rotate_22_june_2019.rotate(array, i);
        int currentSum = RiMinus1+arraySum-(array.length* array[array.length-i]);
            RiMinus1= currentSum;
            maxSum = maxSum<currentSum ? currentSum:maxSum;

        }




    }


    private static int getSum(int arrar[]) {

        int[] test = new int[arrar.length];
        for (int i = 0; i < arrar.length; i++) {
            test[i] = arrar[i] * i;
        }
        return Arrays.stream(test).reduce(0, (a, b) -> a + b);
    }

    private static int getSumArary(int arrar[]) {

        return Arrays.stream(arrar).reduce(0, (a, b) -> a + b);
    }


//    public static void main(String[] args) {
//
//        int array[] = {1, 2, 3, 4};
//
//        int totalSum =getSum(array);
//        int currentRorationSum=totalSum;
//
////        int myarray[] = Rotate_22_june_2019.rotate(array, 2);
////        Display.print(myarray, " \n After-- rotation: - "+(1)+"   -"+ getSum(myarray));
////
//        int previousRorationSum=0;
//        int myarray[] = new int[array.length];
//
//        int getSumArary = getSumArary(array);
//
//        System.out.println("SUM-- :" + getSumArary);
//
//        for (int k = 1; k < array.length; k++) {
//
//            int l =array.length-(k);
//            System.out.println(" -- "+l+" - "+(array[l]));
//
//
//            myarray = Rotate_22_june_2019.rotate(array, k);
//
//            System.out.println("currentRorationSum"+currentRorationSum);
//            System.out.println("getSumArary"+getSumArary);
//            System.out.println("(array.length*(array[l]))"+(array.length*(array[l])));
//
//            int sumByformula= currentRorationSum+(getSumArary- (array.length*(array[l])));
//
//
//            currentRorationSum= getSum(myarray);
//            Display.print(myarray, " \n After rotation: - " + " " + (k) + " by formula sum is +"+sumByformula+" sum is " + currentRorationSum + " and arrayt is -:");
//
//            previousRorationSum=currentRorationSum;
//        }
//
//    }

}
