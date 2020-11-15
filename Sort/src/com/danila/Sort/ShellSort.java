package com.danila.Sort;

public class ShellSort {
    public static void sort(int[] array) {
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int swaps = 0;
        int compares = 0;
        int n = array.length;

        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                compares++;
                for (int j = i - step; j >= 0 && array[j] > array[j+step]; j -= step) {
                    swaps++;
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
        System.out.println();
        System.out.println("Было проведено " + (swaps) + " обменов.");
        System.out.println("Было проведено " + (compares) + " сравнений.");

        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}