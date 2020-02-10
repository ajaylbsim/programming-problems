package com.programming.dst.arrays;

import com.programming.dst.util.Display;
import com.programming.dst.util.sort.QuickSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ARRANGE_GIVEN_NUMBERS_TO_FORM_THE_BIGGEST_NUMBER_28th_JULY {

    public static void main(String[] args) {
//        String[] arr = {"54", "546", "548", "60"};
        String[] arr = {"1", "34", "3", "98", "9", "76", "45", "4"};

        arr = QuickSort.quick_sort(arr, 0, arr.length - 1);

                Display.print(arr, "After ");

        List<String> listOfProducts = Arrays.asList(arr);
        Collections.reverse(listOfProducts);
        arr = listOfProducts.toArray(arr);
//        Display.print(arr, "After ");
//
//        String res = "";
//        System.out.println(res);

//        for (int i = arr.length - 1; i > 0; ) {
//
//            System.out.println("--" + (arr[i] + res));
//
//            res = Long.parseLong(res + arr[i]) > Long.parseLong(arr[i] + res) ? res + arr[i] : arr[i] + res;
//            System.out.println(res);
//            i = i - 1;
//
//        }

        System.out.println(concat(arr, arr.length - 1) + " ");

    }
    static String res = "";


    private static String concat(String[] arr, int start) {
        if (start - 1 < 0) return arr[start];
//          return Long.parseLong(arr[start]) <Long.parseLong( arr[start-1]) ?  arr[start] + concat(arr, start - 1) : concat(arr, start - 1)+arr[start];
        System.out.println();
        String re =arr[start]+":"+concat(arr, start - 1);
        String[] list = re.split(":");
       re = Long.parseLong(list[0]+list[1])> Long.parseLong(list[1]+list[0]) ? list[0]+list[1] : list[1]+list[0];
        System.out.println(" re -"+arr[start] +" -"+arr[start-1]);
        return   re;
    }


    private static String arrange(String[] arr) {

        String result = "";

        for (int i = 0; i < arr.length - 1; i++) {
            result = myCompare(result, arr[i]) > 0 ? result + arr[i] : arr[i] + result;

            System.out.println("myCompare(result,arr[i] ) " + result + "   - " + arr[i] + " - greator is- " + (myCompare(result, arr[i]) >= 1 ? result : arr[i]));
        }
        return result;

    }

    private static int myCompare(String s1, String s2) {
        String[] s1Array = s1.split("");
        String[] s2Array = s2.split("");
        int length = s2Array.length > s1Array.length ? s2Array.length : s1Array.length;
        int big = s2Array.length > s1Array.length ? -1 : 1;

        for (int i = 0; i < length; i++) {
            if ((s1.length() <= i) || (s2.length() <= i)) return s1.compareTo(s2);

            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            } else {
                return big;
            }
        }

        return big;
    }


}
