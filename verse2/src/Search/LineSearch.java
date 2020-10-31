package Search;

public class LineSearch {
    public static int find(int[] array, int target) {
        int counter = 0;
        boolean notFound = true;
        for(int i = 0; i < array.length; i++){
            counter++;
            if(target == array[i]){
                notFound = false;
                System.out.println("Элемент располагался на " + (Integer.toString(++i))
                        + " месте. Было выполнено " + (Integer.toString(counter)) + " проверок");
                break;
            }
        }
        if(notFound) {
            System.out.println("Элемент не найден в массиве. Метод линейного поиска закончил работу после "
                    + (Integer.toString(counter)) + " сравнений");
        }
        return -1;
    }
}
