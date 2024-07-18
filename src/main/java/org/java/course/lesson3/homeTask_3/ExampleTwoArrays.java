package org.java.course.lesson3.homeTask_3;


import java.util.Arrays;

public class ExampleTwoArrays {

    public static void main(String[] args) {

        /*
        * Вывод двумерного массива на экран
         Эту операцию логичнее всего делать так: сначала выводим нулевую строку поэлементно,
         затем — вторую и так далее. Чаще всего в Java вывод двумерного массива реализуют с
         помощью двух вложенных циклов.
        * */
        int[][] twoDimArray1 = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};//объявили массив и заполнили его элементами
        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray1[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        System.out.println(" Далее ->->-> ");
        //объявляем и создаём массив, указывая только количество строк
        int[][] twoDimArray = new int[5][1];

        /*
        * Быстрый вывод двумерного массива
         Самый короткий способ вывести список элементов двумерного массива на экран —
         применение метода deepToString класса Arrays. Пример:
        * */

        int[][] myArray = {{18, 28, 18}, {28, 45, 90}, {45, 3, 14}};
        System.out.println(Arrays.deepToString(myArray));
        System.out.println(" Далее ->->-> ");

        /*
        * “Длины” двумерного массива
         Чтобы получить длину одномерного массива (то есть, количество элементов в нём),
         можно использовать переменную length. То есть, если мы определим массив int a[] = {1,2,3},
          то операция a.length возвращает 3.
        * */

        int [][] twoDimArray2 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println(twoDimArray2.length);
        System.out.println(" Далее ->->-> ");

//инициализируем массив, заполняя его массивами разной длины
        twoDimArray[0] = new int[]{1, 2, 3, 4, 5};
        twoDimArray[1] = new int[]{1, 2, 3, 4};
        twoDimArray[2] = new int[]{1, 2, 3};
        twoDimArray[3] = new int[]{1, 2};
        twoDimArray[4] = new int[]{1};
//выведем получившийся непрямоугольный двумерный массив на экран
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}