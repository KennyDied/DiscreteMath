package com.company;

public class MyBinarySearch<T extends Comparable<? super T>> {
    private static int numOfCompares;

    public static int getNumOfCompares() {
        return numOfCompares;
    }

    // возвращает индекс элемента в массиве со значением value
    // или -1, если такого нет
    public static <T extends Comparable<? super T>> int indexOf(T[] data, T value) {
        int position;
        int positionOfFirstElement = 0;
        int positionOfLastElement = data.length -1;

        position = (positionOfFirstElement + positionOfLastElement) / 2;

        while (!(data[position].compareTo(value) == 0) && (positionOfFirstElement <= positionOfLastElement)) {
            numOfCompares++;
            if (data[position].compareTo(value) > 0) {
                positionOfLastElement = position - 1;
            } else {
                positionOfFirstElement = position + 1;
            }
            numOfCompares++;
            position = (positionOfFirstElement + positionOfLastElement) / 2;
        }
        numOfCompares++;
        if (positionOfFirstElement <= positionOfLastElement) {
           return position;
        } else {
           return -1;
        }
    }
}