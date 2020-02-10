package com.programming.dst.util.sort;

import com.programming.dst.util.Display;

public class QuickSort {


    public static void main(String[] args) {

//        int[] arr = {10, 16, 8, 12, 15, 6, 3, 9, 5};

        char[] arr = {'A', 'Z', 'B'};

        arr = "4534058403958".toCharArray();
        Display.print(arr, "--" + arr.length);


        new QuickSort().quick_sort(arr, 0, arr.length - 1);

    }


    public static int[] quick_sort(int[] arr, int low, int high) {
        while (low < high) {
            int pindex = partition(arr, low, high);
            System.out.println("pindex " + pindex + "  low " + low + "  high " + high);
            Display.print(arr, "Afeter sort");
            quick_sort(arr, low, pindex - 1);
            quick_sort(arr, pindex + 1, high);
            low = high + 1;
        }
        return arr;

    }


    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;


        while (i < j) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = pivot;
        arr[l] = temp;


        return j;

    }


    public static char[] quick_sort(char[] arr, int low, int high) {
        while (low < high) {
            int pindex = partition(arr, low, high);
            System.out.println("pindex " + pindex + "  low " + low + "  high " + high);
            Display.print(arr, "Afeter sort");
            quick_sort(arr, low, pindex - 1);
            quick_sort(arr, pindex + 1, high);
            low = high + 1;
        }
        return arr;
    }


    public static int partition(char[] arr, int l, int h) {
        char pivot = arr[l];
        int i = l;
        int j = h;


        while (i < j) {
            while ((i < h) && arr[i] <= pivot) i++;
            while ((j > l) && arr[j] > pivot) j--;
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        char temp = arr[j];
        arr[j] = pivot;
        arr[l] = temp;


        return j;


}











    public static String[] quick_sort(String[] arr, int low, int high) {
        while (low < high) {
            int pindex = partition(arr, low, high);
            System.out.println("pindex " + pindex + "  low " + low + "  high " + high);
            Display.print(arr, "Afeter sort");
            quick_sort(arr, low, pindex - 1);
            quick_sort(arr, pindex + 1, high);
            low = high + 1;
        }
        return arr;
    }


    public static int partition(String[] arr, int l, int h) {
        String pivot = arr[l];
        int i = l;
        int j = h;


        while (i < j) {

            while ((i < h) && arr[i].charAt(0) <= pivot.charAt(0)){
              //  System.out.println(" comapre "+ arr[i]+ " " + pivot);
                i++;
            }
            while ((j > l) && arr[j].charAt(0) > pivot.charAt(0)) j--;
            if (i < j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[j];
        arr[j] = pivot;
        arr[l] = temp;


        return j;

    }

}

