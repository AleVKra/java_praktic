

package org.java.course.lesson_5.Map;

import java.lang.reflect.Field;
import java.util.*;

public class MainMap_Lection_5 {
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
         * перебор элементов в HashMap и
         * отпечатать набор элементов из HashMap
         * */
        for (Map.Entry<String, String> o : map.entrySet()) {
            System.out.print(o.getKey() + ": ");
            System.out.println(o.getValue());
            System.out.println("==");
        }
        /* метод getOrDefault(), работает следующим образом:
         * 1. если пробовать достать по существующему ключу, то вернет значение
         * 2. если указать не существующее значение ключа, то покажет то что указано в методе
         * */
        System.out.println("1 пример: " + map.getOrDefault("A", "Q" + "->"));
        System.out.println("2 пример: " + map.getOrDefault("Z", "Q"));

        /*
         * 1. HashMap не дает порядка сохранения добавляемых значений
         * 2. LinkedHashMap позволяет сохранять добавляемые значения в пополняемом порядке
         * 3. TreeMap позволяет сохранять в порядке сортировки по ключу
         * */

        /*
         * Set - внутри использует HashMap как основа, сохраняет только уникальные значения.
         *  Метод add() при добавлении значения - true; не получилось добавить -false/
         *  Работает достаточно быстро, т.к. основа HashMap.
         *
         * */
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("U");
        set.add("p");
        set.add("A");
        set.add("A");
        System.out.println(set);   // [p, A, U]

        /*
         * HashTable<>  - раньше работало вместо HashMap.
         * Отличия:
         * 1. В отличии от HashMap не позволяет использовать
         *    в качестве ключа или значения null
         * 2. HashTable синхронизирован в отличии от HashMap
         * 3. В разном виде отдают записи: HashMap в виде Set,
         *      HashTable в виде Enumiration.         *
         * */
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("A", 9);
        table.put("H", 4);
        table.put("Y", 1);
        table.put("D", 6);
        System.out.println(table);

        /*
         * Пример удаления буквы "A" из списка/
         * Вывод: [A, B, C]
         * причина кроется в том что список перемещает позицию
         * i и при следующем проходе "А" не попалает в область
         * видимости цикла.
         * Если применить
         * Set<String> set = new HashSet<>();
         * для прохода всего списка, то не будет больше проблем.
         * 1. Foreach не даст изменять коллекцию в момент обхода.
         * 2. For i не смогу использовать в Set, т.к. там нет индекса.
         *    Для обхода всех значений служит итератор, который позволяет
         *    обходить набор элементов, какую бы он структуру не представлял.
         *
         * */
        List<String> list = new ArrayList<>(Arrays.
                asList("A", "A", "B", "C", "A"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("A")) {
                list.remove(i);
            }
        }
        System.out.println(list);   // [A, B, C]
        /*  Для эфффективного удаления использовать итератор!
         *  !!! Iterator не сможет использоваться в HashMap.
         * */
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String o = iterator.next();
            if (o.equals("A")) {
                iterator.remove();
            }
        }
        System.out.println(list); // [B, C]

        Set<String> setIterator = new HashSet<>();
        setIterator.add("A");
        setIterator.add("AAA");
        setIterator.add("AAAA");
        setIterator.add("AA");
        Iterator<String> iteratorSet = setIterator.iterator();
        while (iteratorSet.hasNext()) {
            String o = iteratorSet.next();
            if (o.length() > 2) {
                iteratorSet.remove();
            }
        }
        System.out.println(setIterator);
        /*
         *  Для того, чтобы пройтись по всем значениям HashMap,
         *  нобходимо вызвать множество entrySet(), и  у него
         *  непосредственно запросить  iterator().
         *  Пример ниже описывает ситуацию прохода и вывода нужных
         *  элементов Map.
         *
         * */
        Map<String, String> mapEntry = new HashMap<>();
        mapEntry.put("djh", "dop");
        mapEntry.put("h", "dop1");
        mapEntry.put("j", "dop2");
        mapEntry.put("dh", "dop3");
        mapEntry.put("dj", "dop4");

        Iterator<Map.Entry<String, String>> iteratorMapSet = mapEntry.entrySet().iterator();
        while (iteratorMapSet.hasNext()) {
            Map.Entry<String, String> entry = iteratorMapSet.next();
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("h")) {
                System.out.println("Key: " + key + " Value: " + value); // Key: h Value: dop1
            }
        }
        /*
         * ListIterator - разновидность итератора,
         * который работает с List, в отличие от Iterator,
         * который решает более общие задачи не примимая во внимание
         * есть ли в списке индексы или нет.
         * Возможности:
         * - спросить есть элемент справа (слева)
         * - удалить элемнт на котором стоим
         * - можно его изменить
         * */
        /*
         * Особенность итератора:
         * При запросе итератора (list.listIterator()), то получается это не просто
         * объект листа, который  при запросе листа сбрасывает внутренний объект листа
         * сбрасвает курсор на ноль и можете сначала начинать обходить.
         * При каждом запросе итератора, он создается по новому.
         * Поэтому при создании каждый раз новогоитератора, создается одновременно мусор
         * в памяти.
         * */

        ListIterator<String> lis = list.listIterator();
        while (lis.hasNext()) {
            String o = lis.next();
            if (o.equals("B")) {
                lis.set("as");
            }
        }
        System.out.println(list); // [as, C]


        /*
         * Пример перебора ключей при одинаковых ключах выводится только одно значение:
         * */
        HashMap<String, Integer> mapKey = new HashMap<>();
        mapKey.put("A", 1);
        mapKey.put("P", 2);
        mapKey.put("C", 3);

        Iterator it= mapKey.keySet().iterator();
        Object key1=it.next();
        Object key2=it.next();
        if (key1==key2) {
            System.out.println("ключи совпадают: "+ mapKey);
        }

    }

    public static void repeatabilityValue(Map<String, Integer> mapKey, String key) {
        HashMap<String, Integer> copy = new HashMap<>(mapKey);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getKey().equals(key))
                mapKey.remove(pair.getKey());
        }
    }

    /*
    * Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
    Удалить людей, имеющих одинаковые имена.

    Требования:
    Программа не должна выводить текст на экран.
    Программа не должна считывать значения с клавиатуры.
    Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String
     состоящих из 10 записей.
    Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
    Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map1 = new HashMap<>();
        for (int i = 0; i < 10; i++) map1.put(i + "N", i + "L");
        return map1;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        for (String v : map.values()) {
            if (Collections.frequency(map.values(), v) > 1)
                removeItemFromMapByValue(map, v);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}