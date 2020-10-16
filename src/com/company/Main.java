package com.company;

public class Main {
    public static void main(String[] args){
        Integer data[] = new Integer[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = 2 * i + 1;
        }

        System.out.println("----Массив----");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        int item = 7;
        System.out.println("----Искомое значение----");
        System.out.println(item);

        System.out.println("----Бинарный поиск----");
        System.out.println("Индекс элемента по значению = " + MyBinarySearch.indexOf(data, item));

        System.out.println("----Линейный поиск----");
        System.out.println("Индекс элемента по значению = " + MyLinearSearch.indexOf(data, item));

    }
}
