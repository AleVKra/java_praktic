/*
 * Copyright (c) 2022 Tander, All Rights Reserved.
 */

package org.java.course.lesson_4.collection.leсtion_1.generic.part_1;

/* наследование от Number - защита от других наследуемых типов данных от Object
- так же появляются методы класса Number
- тип Т не сможет замениться чистым Object так как он наследован Number

*/
public class BoxWithNumbers<N extends Number> {

    private N[] array;

    // можно отдать любое кол-ов int-ов
    public BoxWithNumbers(N... array) {
        this.array = array;
    }

    /*doubleValue() - метод от Number*/
    // среднее кол-во коробок
    public double average() {
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i].doubleValue();
        }
        avg /= array.length;
        return avg;
    }

    // сравнение коробок между собой
    /* такая конструкция не позволит сравнивать разные типы(int и  float)
     *  указанный тип N не позволит сравнить разные типы даже наследников
     *  одного и того же класса!
     *  Для решения такой проблемы необходимо вместо типа поставить "?"
     *  */
    // public boolean compareAverage(BoxWithNumbers<N> another) {

    public boolean compareAverage(BoxWithNumbers<?> another) {
        // в данном случае можно сравнивать разные типы
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}