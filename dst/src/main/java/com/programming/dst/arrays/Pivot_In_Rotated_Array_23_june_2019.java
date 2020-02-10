package com.programming.dst.arrays;

import com.programming.dst.util.Display;

import javax.rmi.CORBA.Util;
import java.util.Arrays;

public class Pivot_In_Rotated_Array_23_june_2019 {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7,8};
        Display.print(array," Before rotation ");
        array =Rotate_22_june_2019.rotate(array, 36);
        Display.print(array," \n After rotation ");
        //System.out.println("\n>>>>>>>>>>Pivot element is >>>>>  "+FindPivot(array));
        System.out.println("\n>>>>>>>>>>Pivot element is >>>>>  "+array[findPivot(array,0,array.length)]);


    }


    public static int FindPivot(int[] array) {
        return pivot(array,0,array.length-1);
    }

    public static int pivot(int[] array,int low,int high) {

       int mid = (low+high)/2;

        System.out.println(">>>>>>>>>>>>>>>  "+mid+  "  - "+low+"  "+high);

       if((mid<high)&& (array[mid] >array[mid+1])) return array[mid];

        if((mid>low)&& (array[mid] <array[mid-1])) return array[mid-1];

        if(array[low] >array[mid]){
            return pivot(array,low,mid-1);
        }
        return pivot(array,mid+1,high);

    }



   public static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low) return -1;
        if (high == low) return low;

        int mid = (low + high)/2; /*low + (high - low)/2;*/
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;

        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid-1);

        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid-1);

        return findPivot(arr, mid + 1, high);
    }


}

