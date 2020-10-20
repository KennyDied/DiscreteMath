package ru.vsu.cs.dm.danila;

public class LinearSort {
    private static int numOfCompares;

    public static int sortArray(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    numOfCompares++;
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return numOfCompares;
    }
}