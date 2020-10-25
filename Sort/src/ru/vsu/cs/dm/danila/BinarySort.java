package ru.vsu.cs.dm.danila;

import java.util.Arrays;

public class BinarySort {
    private static int numOfCompares;

    public static int sortArray(int array[]) {
        for (int k = 1; k < array.length; k++) {
            int newElement = array[k];
            int index;
            index = Arrays.binarySearch(array, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(array, index, array, index + 1, k - index);
            array[index] = newElement;
            numOfCompares++;
        }
        return numOfCompares;
    }
}