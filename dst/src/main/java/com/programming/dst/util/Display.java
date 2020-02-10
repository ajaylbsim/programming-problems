package com.programming.dst.util;

public class Display {
    public static void print(int[] array,String message) {
        System.out.println(message);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }


    public static void print(char[] array,String message) {
        System.out.println(message);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }



    public static void print(String[] array,String message) {
        System.out.println(message);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }



}
