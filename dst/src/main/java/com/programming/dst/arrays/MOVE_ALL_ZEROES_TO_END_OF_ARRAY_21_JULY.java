package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class MOVE_ALL_ZEROES_TO_END_OF_ARRAY_21_JULY {

    public static void main(String[] args) {

        int []arr ={1, 2, 0, 0, 0, 3, 6};
        Display.print(rearrange(arr),"");
    }


    public static int[] rearrange(int[] array) {
        int zeroCounter=array.length-1;
        for (int i=array.length-1;i>1;i--){
            if( (array[i]+array[i-1]) ==array[i]){
                int temp =array[i-1];
                array[i-1]=array[zeroCounter];
                array[zeroCounter]=temp;
                zeroCounter--;
            }
        }

        return array;

    }

}
