package com.programming.dst.arrays;

import com.programming.dst.util.Display;

import java.io.DataInput;

public class Find_maximum_value_of_sum_iarri_with_only_rotations_on_given_array_allowed {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Sum is "+findSum(array));

        array = Rotate_22_june_2019.rotate(array, 50);
        Display.print(array, "After Rotation :- ");
        System.out.println("Sum is "+findSum(array));
    }


    public static int findSum(int [] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i]*(i);
        }
        return sum;

    }







}
