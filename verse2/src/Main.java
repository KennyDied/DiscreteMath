import Search.BinarySearch;
import Search.LineSearch;
import Sort.BinaryInsertionSort;
import Sort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 5};
        int lookingItem = 5;

//        LineSearch.find(array, lookingItem);
        BinarySearch.find(array, lookingItem);
//        InsertionSort.sort(array);
//        BinaryInsertionSort.sort(array);
    }
}