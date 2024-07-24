package org.java.course.lesson_4.collection.homeTask_4;

import java.util.Arrays;

public class MainHome_4 {


    public static void main(String[] args) {
        int[] arr = new int[]{101, 10, 11, 100, 32, 34, -61, 14, 90, 29, -5};
        int max = arr[0];
        int min = arr[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) { // сравниваем
                maxInd = i; // запоминаем индекс
                max = arr[i]; // запоминаем значение
            }
            if (min < arr[i]) { // сравниваем
                minInd = i; // запоминаем индекс
                min = arr[i]; // запоминаем значение
            }
        }
// переставляем элементы
        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;
        Arrays.stream(arr).forEach(e-> System.out.print(e +"; ")); // вывод массива
//        arrPosition(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }

    static void arrPosition(int... arr) {
        int[] arr1 = new int[arr.length];
//        int k = arr.length;
        int i = 0, j = 0;
        for (; j < arr1.length; j++) {
            arr1[j] = arr[i];
            for (; i < arr.length; i++) {

            }
        }

//      {
//             {
//
//                if (i == 5) {
//                    arr1[j + 1] = arr[i];
//                    arr1[j] = arr[i + 1];
//                }
//
//            }
//        }
//        for (int k = 0; k < arr1.length; k++) {
//            System.out.print(arr1[k]);
//        }
    }
}
