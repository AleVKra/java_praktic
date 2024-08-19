package org.java.course.lesson_5.Map.homeTask_5;

import java.util.HashMap;

public class MainClass_5 {

    public static void main(String[] args) {
        /*
        * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
            Найти и вывести список уникальных слов, из которых состоит массив (дубликаты
             не считаем). Посчитать, сколько раз встречается каждое слово.
         */
        String[] arr = {
                "один", "два", "два", "тир", "тном", "гусь", "тном", "береза", "утка",
                "поле", "сказка", "сказка", "прогулка", "велосипед", "лыжи", "лодка"
        };
        String replay = "";
        int sumReplay = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = false;
                    sumReplay = sumReplay + 1;
                    break;
                }
            }
            if (flag) System.out.print(arr[i] + " \n");
        }
        findAndCountUniqueWords(arr);
    }

    /*
     * аналогичное решение при помощи HashMap
     */
    public static void findAndCountUniqueWords(String... arr) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str : arr) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }
}
