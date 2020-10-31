package Sort;

public class BinaryInsertionSort {
    public static void sort(int[] array) {

        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int x;
        int left;
        int right;
        int middle;
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
                x = array[i];
                left = 0;
                right = i - 1;
                do {
                    counter++;
                    middle = (left + right) / 2;

                    if (array[middle] < x) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                } while (left <= right);

                if (i - left >= 0) System.arraycopy(array, left, array, left + 1, i - left);
                array[left] = x;
        }
        System.out.println("Было проведено " + (counter) + " операций.");
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}