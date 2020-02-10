package com.programming.dst.random;

public class LongestSubSequence {

    public static void main(String[] args) {
        System.out.println("Ajay kumar mishra");
        int[] arr = new int[]{3, 4, -1, 0, 2, 6};

        longestSequence(arr);
    }

    private static int[] longestSequence(int[] arr) {
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                //System.out.println(i + " - " + j + ", ");
                if (arr[j] < arr[i]) {
                    resultArray[i] = resultArray[i] > resultArray[j] + 1 ? resultArray[i] : resultArray[j] + 1;
                }

            }

            System.out.println("\n");

        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
        return resultArray;
    }


}
