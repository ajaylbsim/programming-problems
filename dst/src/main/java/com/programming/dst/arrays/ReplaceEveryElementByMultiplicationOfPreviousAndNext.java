package com.programming.dst.arrays;

import com.programming.dst.util.Display;

import java.util.Objects;

public class ReplaceEveryElementByMultiplicationOfPreviousAndNext {

    public static String getValidString(String obj){
        String fname = Objects.toString(obj,"").trim();
        return fname.equalsIgnoreCase("null")?"":fname;
    }

    public static void main(String[] args) {
        Boolean myname = Boolean.FALSE;
        System.out.println((myname||true||false) );


    }



    public static void  mul(int[] arr){

        int pre=0;
        int next=1;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[pre]*arr[next] +", ");
            if (i!=0)
            pre++;

            if(next!=arr.length-1)
            next++;
        }

        Display.print(arr,"After print");
    }


}



