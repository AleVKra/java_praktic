package org.java.course.lesson_4.collection.homeTask_4;

import java.util.Arrays;
import java.util.List;

public class MainHome_4 {

    public static void main(String[] args) {
        ReplacingElements replacingElements = new ReplacingElements();
        int[] arr = new int[]{56, 76, 53, 4563, 13, 35, -95, 38, -645, 123, -5};
        System.out.println(" перестановка указанных занчений массива обычным способом: ");
        replacingElements.permutation(arr);

        Object[]arr1 = new Object[]{56, 76, 53, 4563, 13, 35, -95, 38, -645, 123, -5};
        System.out.println(" перестановка указанных занчений массива при помощи Дженерика: ");
        replacingElements.permutationGen(arr1, 1, 6);
        System.out.println(arr1);

        ArrayToList arrayToList = new ArrayToList();
        String array[] = {"Kivi", "Oranges", "vegetables"};
        System.out.println("initial array : " + Arrays.toString(array));
        List<String> list = arrayToList.convertArrayToList(array);
        list.add("Яблоко");
        System.out.println("Грубый List: " + list);

        List<String> listAsList = arrayToList.convertArrayToListAsList(array);
        listAsList.add("Тыква");
        System.out.println(listAsList);

    /* В данном случае выводит:
    Exception in thread "main" java.lang.UnsupportedOperationException*/
        List<String> listAddAll = arrayToList.convertArrayToListaddAll(array);
//        convertArrayToListaddAll(array).add("ж");
    }
}