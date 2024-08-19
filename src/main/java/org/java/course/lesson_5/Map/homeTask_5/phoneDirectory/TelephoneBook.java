package org.java.course.lesson_5.Map.homeTask_5.phoneDirectory;

import java.util.*;

public class TelephoneBook {
/*
* решение задачи:
* HashMap<String, HashSet<String>> hmPhoneBook;

	public PhoneBook() {
		hmPhoneBook = new HashMap<>();
	}

	public void add(String fio, String phone) {
		if (!hmPhoneBook.containsKey(fio)) {
			hmPhoneBook.put(fio, new HashSet<>());
		}
		hmPhoneBook.getPhoneNumberBySurname(fio).add(phone);
	}
	public Set<String> getPhoneNumberByFio(String fio) {
		return hmPhoneBook.getPhoneNumberBySurname(fio);
	}
	Set<String> getAllFio() {
		return hmPhoneBook.keySet();
	}*/


    /*
     *  2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
     *  телефонных номеров.
     *  В этот телефонный справочник с помощью метода add() можно добавлять записи,
     *  а с помощью метода getPhoneNumberBySurname() искать  номер телефона по фамилии.
     *  Следует учесть, что под одной фамилией может быть несколько телефонов
     *  (в случае  однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
     *  Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
     *  взаимодействие с пользователем через консоль и т.д).
     *  Консоль использовать только для вывода результатов проверки телефонного справочника.
     */
    HashMap<String, HashSet<String>> mapTelephoneBook;

    public TelephoneBook() {
        mapTelephoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!mapTelephoneBook.containsKey(surname)) {
            mapTelephoneBook.put(surname, new HashSet<>());
        }
        mapTelephoneBook.get(surname).add(phoneNumber);
    }


    public HashSet<String> getPhoneNumberBySurname(String surname) {
        return mapTelephoneBook.get(surname);
    }

    Set<String> getAllSurname() {
        return mapTelephoneBook.keySet();
    }
/*

    private String surname;
    private int[] phoneNumber;
    HashMap<String, int[]> subNamePhone = new HashMap<>();


    public TelephoneBook(String surname, int... phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }


    public void add() {
        subNamePhone.put(surname, phoneNumber);
    }

    public void getPhoneNumberBySurname() {
        for (Map.Entry<String, int[]> o : subNamePhone.entrySet()) {
//            HashMap<String, int[]> copy = new HashMap<>(subNamePhone);
//            for (Map.Entry<String, int[]> pair : copy.entrySet()) {
//                if (pair.getKey().equals(o.getKey())) {
//                    System.out.println(Arrays.toString(o.getValue()) + " и др.");
//                    System.out.println(Arrays.toString(pair.getValue()));
//                }
//            }
            System.out.println(Arrays.toString(o.getValue()));
            System.out.println("==");
        }
    }
*/
}
