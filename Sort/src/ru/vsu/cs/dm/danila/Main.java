package ru.vsu.cs.dm.danila;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        int[] data = new int []{5, 4, 3, 2, 1};
        System.out.println("---Линейная сортировка---");
        System.out.println("До    - " + Arrays.toString(data));
        LinearSort.sortArray(data);
        System.out.println("После - " + Arrays.toString(data));
        System.out.println("Количесво сравнений - " + LinearSort.sortArray(data));


        data = new int []{5, 4, 3, 2, 1};
        System.out.println();
        System.out.println("---Бинарная сортировка---");
        System.out.println("До    - " + Arrays.toString(data));
        BinarySort.sortArray(data);
        System.out.println("После - " + Arrays.toString(data));
        System.out.println("Количесво сравнений - " + BinarySort.sortArray(data));

    }
}