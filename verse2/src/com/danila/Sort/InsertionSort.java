package com.danila.Sort;

public class InsertionSort {
    public static void sort(int[] array) {

        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int swaps = 0;
        int compares = 0;
        for (int i = 1; i < array.length; i++) {
            compares++;
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                swaps++;
                int tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
            }
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