package com.company;

public class Main {
    public static void main(String[] args){
        Integer data[] = new Integer[170];       //размер массива
        for (int i = 0; i < data.length; i++) { //создание массива
            data[i] = 2 * i + 1;
        }

        System.out.println("----Массив----");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println();


        int item = 1;
        System.out.println("Искомое значение = " + item);
        System.out.println();


        System.out.println("----Бинарный поиск----");
        System.out.println("Индекс элемента по значению = " + MyBinarySearch.indexOf(data, item));
        System.out.println("Количество сравнений = " + MyBinarySearch.getNumOfCompares());
        System.out.println();


        System.out.println("----Линейный поиск----");
        System.out.println("Индекс элемента по значению = " + MyLinearSearch.indexOf(data, item));

    }
}
