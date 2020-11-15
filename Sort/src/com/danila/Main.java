package com.danila;

import com.danila.Sort.BinaryInsertionSort;
import com.danila.Sort.BubbleSort;
import com.danila.Sort.InsertionSort;
import com.danila.Sort.ShellSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] randomArray = {7, 3, 8, 4, 0, 1, 5, 6, 2, 9};

        System.out.println("----Сортировка Пузырьком----");
        BubbleSort.sort(reversedArray);
        System.out.println();

//        System.out.println();
//        System.out.println("----Сортировка Шелла----");
//        ShellSort.sort(randomArray);


//        System.out.println();
//        System.out.println("----Линейная сортировка----");
//        InsertionSort.sort(reversedArray);


//        System.out.println();
//        System.out.println("----Бинарная сортировка----");
//        BinaryInsertionSort.sort(reversedArray);
    }
}