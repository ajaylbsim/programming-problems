package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class FIND_THE_MINIMUM_ELEMENT_IN_A_SORTED_AND_ROTATED_ARRAY {


    public static void main(String[] args) {
        int[] array = {10, 12, 13, 14, 15, 175, 175, 2228};
        Display.print(array, " Before rotation ");
       array = Rotate_22_june_2019.rotate(array, 23);

        Display.print(array, " After rotation ");

        System.out.println(">>>>>>>>>>>>  "+findMinimumElementInRotatedArary(array,0,array.length-1));

    }





    public static  int findMinimumElementInRotatedArary( int[] array, int low, int high){

        System.out.println("high "+high);

        //if(high<low) return array[0];

        if (high == low) return array[low];


        int mid = low+(high-low)/2;

        if((high>mid) && (array[mid]>array[mid+1])) return array[mid+1];

        if((mid>low) && (array[mid]<array[mid-1])) return array[mid];

        if (array[high]>array[mid])
            return  findMinimumElementInRotatedArary(array,0,mid-1);
        else
            return findMinimumElementInRotatedArary(array,mid+1,high);

    }





}
