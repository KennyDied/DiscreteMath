package com.danila.Sort;

public class MergeSort {
    int counter = 0;


    public void sort(int[] array) {
        System.out.println("Массив до сортировки: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        array = sortArray(array);
        System.out.println("Было проведено " + (counter) + " операций.");
    }

    private int[] sortArray(int[] arrayA) {
        if (arrayA == null) {
            return null;
        }

        if (arrayA.length < 2) {
            return arrayA;
        }

        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    private int[] mergeArray(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            counter++;
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[arrayB.length - positionB - 1];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[arrayA.length - positionA - 1];
                positionA++;
            } else if (arrayA[arrayA.length - positionA - 1] < arrayB[arrayB.length - positionB - 1]) {
                arrayC[i] = arrayA[arrayA.length - positionA - 1];
                positionB++;
            } else {
                arrayC[i] = arrayB[arrayB.length - positionB - 1];
                positionA++;
            }
        }
        return arrayC;
    }
}