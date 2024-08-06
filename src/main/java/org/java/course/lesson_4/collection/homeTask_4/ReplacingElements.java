package org.java.course.lesson_4.collection.homeTask_4;

import java.util.Arrays;

public class ReplacingElements {
    /*
     * СПОСОБ ПЕРЕСТАНОВКИ ИСПОЛЬЗУЯ ДЖЕНЕРИКИ
     */
    public void permutationGen(Object[] arr, int n1, int n2){
        Object obj = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=obj;
        Arrays.stream(arr).forEach(e -> System.out.print(e + "; ")); // вывод массива
        System.out.println("");
    }


    /* перестановка указанных элементов массива
     * обычный способ перестановки БЕЗ ДЖЕНЕРИКОВ*/
    void permutation(int[] arr) {
        int el1 = arr[6];
        int el2 = arr[3];
        int el1Index = 0;
        int el2Index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (el1 == arr[i]) {
                el1Index = i; // запоминаем индекс
                el1 = arr[i]; // запоминаем значение
            }
            if (el2 == arr[i]) { // сравниваем
                el2Index = i; // запоминаем индекс
                el2 = arr[i]; // запоминаем значение
            }
        }
// переставляем элементы
        int temp = arr[el2Index];
        arr[el2Index] = arr[el1Index];
        arr[el1Index] = temp;
        Arrays.stream(arr).forEach(e -> System.out.print(e + "; ")); // вывод массива
        System.out.println("");
    }

    /* Дополнительно, поиск минимального и максимального значения
    в массиве с перестановкой
    поиск большего и меньшего значения в массиве и замена их местами
     */
//    static void minAndMaxPermutation(int[] arr) {
//        int max = arr[0];
//        int min = arr[0];
//        int maxInd = 0;
//        int minInd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (max > arr[i]) { // сравниваем
//                maxInd = i; // запоминаем индекс
//                max = arr[i]; // запоминаем значение
//            }
//            if (min < arr[i]) { // сравниваем
//                minInd = i; // запоминаем индекс
//                min = arr[i]; // запоминаем значение
//            }
//        }
//        // переставляем элементы
//        int temp = arr[minInd];
//        arr[minInd] = arr[maxInd];
//        arr[maxInd] = temp;
//        Arrays.stream(arr).forEach(e -> System.out.print(e + "; ")); // вывод массива
//    }
}
