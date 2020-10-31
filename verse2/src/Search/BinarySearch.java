package Search;

public class BinarySearch{
    public static int find(int[] array, int target) {
        binarySearch(array,array.length -1, target);
        return -1;
    }

    private static void binarySearch(int[] array, int last, int target) {
        int first = 0;
        int position;
        int comparisonCount = 1;

        position = (first + last) / 2;

        while ((array[position] != target) && (first <= last)) {
            comparisonCount++;
            if (array[position] > target) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println((Integer.toString(target)) + " является " + (Integer.toString(++position)) + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + (Integer.toString(comparisonCount)) +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + (Integer.toString(comparisonCount)) + " сравнений");
        }
    }
}
