package com.danila.Sort;



public class QuickSort{
    int counter = 0;
    int compares = 0;
    int swaps = 0;

    public void sort(int[] array) {
        System.out.println("Массив до сортировки: ");
        for (int value : array) {
            System.out.print(value + " ");
        }



        System.out.println();
        System.out.println();


        quickSort(array, 0 , array.length - 1);
//        System.out.println("Было проведено " + (counter) + " операций.");
        System.out.println("Было проведено " + (compares) + " сравнений.");
        System.out.println("Было проведено " + (swaps) + " перестановок.");
        System.out.println();

        System.out.println("Массив после сортировки: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low; //- первый, low + (high - low) / 2; - средний
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {

            while (arr[i] < pivot) {
                compares++;
                //counter++;
                i++;
            }

            while (arr[j] > pivot) {
                compares++;
                //counter++;
                j--;
            }

            compares++;
            if (i <= j) {
                swaps++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}