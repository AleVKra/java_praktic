/*
 * Copyright (c) 2022 Tander, All Rights Reserved.
 */

package org.java.course.lesson_4.collection.leсtion_1.generic.part_1;

// ПОЧЕМУ НУЖНЫ ДЖЕНЕРИКИ (обощения)???
public class MainApp {
    public static void main(String[] args) {
        SimplBox intBox1 = new SimplBox(10);
        SimplBox intBox2 = new SimplBox(20);

        // просуммируем обе коробки следующим образом:
//		int sum = intBox1.getObj() +intBox2.getObj();
        // .. и убедимся что будет выбрасывать ошибку, если не преобразовать к обному типу  Integer
//        c выводом в консоль..
        int sum1 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println(sum1);     // в консоли: 30
//       1. не удобно каждые раз преобразовывать к Integer
//       2. Коробки могут плавать по программе и где то
//         можно забыться и положить вместо Integer String, смотреть ниже
        // ....
        intBox1.setObj("Java"); // или Error

        // Так же от подобных случаев можно защититься следующим образом:
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum: " + sum);
        } else {
            System.out.println("Error");
        }
        /*
         *!!!!!  БОЛЬШОЙ МИНУС НАПИСАННОГО ВЫШЕ КОДА БЕЗ ДЖЕНЕРИКОВ!!!!!
         * ОШИБКИ, возникающие при выполнении будут определяться на этапе исполнения
         * В слячае замены кода ДЖЕНЕРИКАМИ, ошибки будут определяться на этапе компиляции
         * т.е., если я положу в коробку что то не то, то увижу на этапе компиляции, а не выполнения*/
        /*
         * При ниже предложенной конструкции кода, можно менять в конструкторе тип ожидаемых параметров.
         * Решает следующие проблемы:
         * 1. избавление от проверок
         * 2. не нужно приводить к определенному типу
         * 3. вместо определенного типа нельзя положить другой тип данных
         * */
        GenBox<String> strBox = new GenBox<>("Java");
        GenBox<Integer> intBox1gen = new GenBox<Integer>(20);
        GenBox<Integer> intBox2gen = new GenBox<Integer>(100);

        // в любом случае прилетают типы int
        int sum = intBox1gen.getObj() + intBox2gen.getObj();
        System.out.println(sum);

        /*
        Пример вызова класса с наследованным Number
        */
        BoxWithNumbers<Integer> intBoxGen = new BoxWithNumbers<>(1, 2, 3, 4);
        System.out.println(intBoxGen.average());
        BoxWithNumbers<Integer> intBox2Gen = new BoxWithNumbers<>(1, 2, 3, 4);
        System.out.println(intBox2Gen.average());
        BoxWithNumbers<Float> floatBoxGen = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(floatBoxGen.average());
        /*сравнение коробок:
         * */
        System.out.println(intBoxGen.compareAverage(intBox2Gen));
        System.out.println(intBoxGen.compareAverage(floatBoxGen));
        /*!!!  НЕТ НИ КАКОГО СПЕЦИАЛЬНОГО МЕХАНИЗМА ДЖЕНЕРИКОВ В JAVA !!!* */
        /*Спросить у коробки, какой у неё класс:
         **/
        System.out.println(intBoxGen.getClass().getName());
        // вывод: org.java.course.lesson_4.collection.leсtion_1.generic.lesson.BoxWithNumbers
        /*
         * При компиляции все типя данных которые написали заменяются на Objcet,
         * там где использюутся ДЖЕНЕРИКИ, компилятор подставляет сравнение
         * Таким образом мы не можем в RunTime узнать какой же тип у нашего объекта
         * */
// разница м/д doSomething1 и doSomething2
        GenBox<Number> gbn = new GenBox<>(1);
        GenBox<Integer> gbi = new GenBox<>(1);
        doSomething1(gbn);
        doSomething2(gbn);
        doSomething1(gbi);
        /* выдает ошибку при компиляции, т.е. сразу увидим.
         * - разница состоит в том что в ОБОБЩЕНИЯХ НЕ РАБОТАЕТ НАСЛЕДОВАНИЕ*/
//		doSomething2(gbi);
        /*!!!! НЕ ДОПУСТИМО ТАК ЖЕ ПИСАТЬ СЛЕДУЮЩЕЕ:*/
//        GenBox<Number> gbx = new GenBox<Integer>(123);

        /*объясняется это так:
         * - когда слева можно ложить любой формат чисел, то справа прописаны ограничения
         * по вложению чисел, только целочисленный формат Integer,
         * полное противоречие*/
        /*
         * вызов методов с входными массивами
         * */
        method1(new int[]{1, 2, 3, 4, 5});
        method2(1, 2, 3, 4, 5);
    }
    /*
     * ПРИ ЖЕЛАНИИ сделать что то с коробкой, можно написать что это
     * можно сделать с коробкой любого типа, которая наследуется от Number.
     * GenBox не ограничен, там просто тип "T" -> ограничения в ожидаемом параметре
     * метода doSomething1.
     * */

    public static void doSomething1(GenBox<? extends Number> box) {
    }

    /*
     * Разница GenBox<Number> от GenBox<? extends Number>:
     * - разница состоит в том что в ОБОБЩЕНИЯХ НЕ РАБОТАЕТ НАСЛЕДОВАНИЕ
     * */

    public static void doSomething2(GenBox<Number> box) {
    }

    /*
     * если придется накидывать переменные вручную
     * */
    public static void method1(int[] arr) {

    }

    /*
     * запись получается короче
     * можно так писать если знаем точно что прилетает готовый массив
     *
     * */
    public static void method2(int... arr) {

    }
}
