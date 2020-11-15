package com.danila.Sort;

public class ShellSort {
    public static void sort(int[] array) {
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//        int swaps = 0;
//        int compares = 0;
//        int step = array.length;       //изначатьный шаг равен половине длины массива
//        for (int gap = step / 2; gap > 0; gap /= 2) {
//            for (int i = gap; i < step; i++) {
//                int key = array[i];
//                int j = i;
//                while (j >= gap && array[j - gap] > key) {
//                    array[j] = array[j - gap];
//                    j -= gap;
//                }
//                array[j] = key;
//            }
//        }

        int n = array.length;
        int counter = 0;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0 ; j -= step) {
                    counter++;
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
        System.out.println("Было проведено " + (counter) + " операций.");



        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        System.out.println();
//        System.out.println("Было проведено " + (swaps) + " обменов.");
//        System.out.println("Было проведено " + (compares) + " сравнений.");
    }
}