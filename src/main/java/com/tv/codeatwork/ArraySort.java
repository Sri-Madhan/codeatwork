package com.tv.codeatwork;

import java.util.Arrays;

/**
 * 
 * Sort an Array of 0s, 1s, and 2s:
 * This is a typical array rearrangement problem where we need to sort elements
 * based on their values (0, 1, and 2).
 * While this can be solved using sorting approaches, consider more efficient
 * solutions.
 *
 */

public class ArraySort {

    public static int[] sort(int[] inputArray) {
        if (inputArray == null) {
            System.out.println("Array is empty");
            return inputArray;
        }

        if (inputArray.length == 0) {
            System.out.println("Array is empty");
            return inputArray;
        }

        if (inputArray.length > 1) {

            int zeroCount = 0, oneCount = 0, twoCount = 0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == 0) {
                    zeroCount++;
                } else if (inputArray[i] == 1) {
                    oneCount++;
                } else if (inputArray[i] == 2) {
                    twoCount++;
                } else {
                    System.out.println("Invalid element found in array: " + inputArray[i]);
                    return inputArray;
                }
            }

            for (int i = 0; i < inputArray.length; i++) {
                if (i < zeroCount) {
                    inputArray[i] = 0;
                } else if (i >= zeroCount && i < zeroCount + oneCount) {
                    inputArray[i] = 1;
                } else {
                    inputArray[i] = 2;
                }
            }

        } else {
            System.out.println(inputArray[0]);
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = { 0, 0, 0, 0, 0, 0, 0, 0, 2, 1};
        System.out.println(Arrays.toString(sort(inputArray)));
    }
}
