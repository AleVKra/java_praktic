package org.java.course.lesson_4.collection.homeTask_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

    /*метод преобразующий массив в ArrayList 1-ый способ:*/
    /* Использование наивного метода или метода грубой силы
В этом методе список создается из пустого массива, и каждый элемент массива добавляется в него один за другим. Метод работает после выполнения следующих действий:
Получите массив.
Создайте пустой список.
Переберите элементы в массиве.
Теперь добавьте каждый элемент в массив.
Верните полный список.
В данном примере массив фруктов преобразуется в список фруктов:*/
    public <T> List<T> convertArrayToList(T array[]) {
        System.out.println("метод преобразующий массив в ArrayList 1-ый способ: ");
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }

    /*
    Метод Arrays.asList() преобразующий массив в ArrayList 2-ой способ:*/
    /*
С помощью метода Arrays.asList() массив передается в конструктор List в качестве параметра для конструктора. Для преобразования массива в список здесь нужно выполнить следующие шаги:
Получите массив.
Создайте список, минуя массив в качестве параметра в конструкторе списка.
Верните полный список.
Вот пример использования метода Arrays.asList() для преобразования массива фруктов в список:*/
    public <T> List<T> convertArrayToListAsList(T array[]) {
        System.out.println("Метод Arrays.asList() преобразующий массив в ArrayList 2-ой способ: ");
       /*Важное условие при добавлении в список, полученный из массива:
       * необходимо создавать новый список через (new), для того чтобы можно бдыло
       * добоавлять и удалять элементы списка.
       * При */
        List<T> list = new ArrayList(Arrays.asList(array));
        list.add((T) "Груша");
        return list;
    }

    /*метод преобразующий массив в ArrayList 3-ий способ:*/
   /* Метод Collections.addAll()
    Поскольку списки являются частью пакета Collection в Java, можно преобразовать массив в список с помощью метода Collections.addAll().

    Этот метод преобразует массив в список, используя следующие действия:
    Получаем массив.
    Создаем пустой список.
    Преобразуем массив в список с помощью метода collections.addAll().
    Возвращаем список.*/
    public <T> List<T> convertArrayToListaddAll(T array[]) {
        System.out.println("Collections.addAll() преобразующий массив в ArrayList 3-ий способ:\n" +
                "имеет много ограничений, поэтому добавление и удаление элементов в нём не возможно!\n" +
                "- вывод ошибки: Exception in thread \"main\" java.lang.UnsupportedOperationException");
        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);
        return list;
    }
}
