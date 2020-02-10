package com.programming.dst.arrays;

import com.programming.dst.util.Display;

public class REARRANGE_AN_ARRAY_SUCH_THAT_21_JULY {

    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, 0, 4, -1};
        Display.print(rearrange(arr)," after arragement");
    }


    private static int[] rearrange(int arr[]) {


        for (int i = 0; i < arr.length; i++) {


            if ((arr[i] == -1) || (arr[i] == i)) continue;

            int x = arr[i];
            System.out.println("--"+i +"- -"+arr[i]+" c" + ((arr[x] != -1) && (arr[x] != x)));
            while ((arr[x] != -1) && (arr[x] != x)) {
                System.out.println("--"+"lop ");

                int y = arr[x];
                arr[x] = x;
                x = y;
            }
            System.out.println("--"+i +"--"+arr[i]);
           arr[x]=x;

            if(arr[i]!=i) arr[i]=-1;


        }


        return arr;
    }


}
