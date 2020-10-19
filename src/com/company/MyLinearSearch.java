package com.company;

public class MyLinearSearch<T extends Comparable<? super T>> {
    public static <T extends Comparable<? super T>> int indexOf(T[] data, T value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }
}