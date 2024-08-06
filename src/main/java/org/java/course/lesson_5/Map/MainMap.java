

package org.java.course.lesson_5.Map;

import java.lang.reflect.Field;
import java.util.*;

public class MainMap {
    /*Пример быстроты сортировки allist и llist*/
    public static void main(String[] args) throws Exception {

        Map<String, String> map = new HashMap<>(8);
        map.put("A", "B");
        map.put("A2", "B");
        map.put("A3", "B");
        map.put("A4", "B");
        map.put("A5", "B");
        map.put("A6", "B");
//        map.put("A7", "B");
        /*
         * узнать размер таблицы можно следующим образом:
         * */
        Class hashMapClass = HashMap.class;
        Field tableField = hashMapClass.getDeclaredField("table");
        tableField.setAccessible(true);
        int capasity = ((Object[]) tableField.get(map)).length;
        System.out.println(capasity);  // 8
        /*
         * перебор элементов в HashMap
         * */
        for (Map.Entry<String, String> o : map.entrySet()) {
            System.out.print(o.getKey()+ ": ");
            System.out.println(o.getValue());
            System.out.println("==");
        }
    }
}