package com.danila.Sort;

public class BinaryInsertionSort {
    public static void sort(int[] array) {

        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int x;
        int left;
        int right;
        int middle;
        int swaps = 0;
        int compares = 0;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            left = 0;
            right = i - 1;
            do {
                swaps++;
                middle = (left + right) / 2;

                compares++;
                if (array[middle] < x) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }

            } while (left <= right);

            compares++;
            if (i - left >= 0) System.arraycopy(array, left, array, left + 1, i - left);
            array[left] = x;

        }
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Было проведено " + (swaps) + " обменов.");
        System.out.println("Было проведено " + (compares) + " сравнений.");

    }
}