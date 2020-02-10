package com.programming.dst.arrays;

import com.programming.dst.util.Display;

import java.util.Arrays;

public class REARRANGE_AN_ARRAY_IN_ORDER__SMALLEST_LARGEST_2ND_SMALLEST_2ND_LARGEST {

    public static void main(String[] args) {

        //int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};

        int arr[] = {1, 2, 3, 4};
       arr = new REARRANGE_AN_ARRAY_IN_ORDER__SMALLEST_LARGEST_2ND_SMALLEST_2ND_LARGEST().arrange(arr);

        Display.print(arr,"array after arrangement");
    }



    private int[]  arrange(int[] arr){
        Arrays.sort(arr);
        int i =-1;
        while (i<arr.length-2){
            i=i+2;
            int temp = arr[arr.length-1];
            arr = shift(arr,i);
            arr[i]=temp;
        }
        return arr;
       }

    private int[] shift(int [] arr,int start){

        for(int i=arr.length-1;i>start;i--){

            arr[i] = arr[i-1];
        }
        return arr;
    }

}
