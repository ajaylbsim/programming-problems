package com.programming.dst.arrays;

public class MinimumJumps {


    public static void main(String[] args) {

        int arr[] = {1, 3, 6, 3, 2,
                3, 6, 8, 9, 5};
        int n = arr.length;
        System.out.println("Minimum number of jumps to reach end is "+minJumps(arr, 0, n-1));

    }


   public static   int minJumps(int arr[], int l, int h)
    {

        if (h == l)
            return 0;

        if (arr[l] == 0)
            return 9999;


        int min = 9999;
        for (int i = l + 1; i <= h &&
                i <= l + arr[l]; i++)
        {
           // System.out.println("Minimum number of jumps from i +"+l+"+ to reach end is{} "+min);
            int jumps = minJumps(arr, i, h);
            System.out.println("Minimum number of jumps from i +"+l+"+ to reach end is{} "+min);

            if(jumps != 9999 && jumps + 1 < min)
                min = jumps + 1;
        }

        return min;
    }


}
