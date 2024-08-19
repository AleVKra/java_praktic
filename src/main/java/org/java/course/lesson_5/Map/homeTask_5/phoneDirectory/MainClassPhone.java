package org.java.course.lesson_5.Map.homeTask_5.phoneDirectory;

//2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//  В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода getPhoneNumberBySurname() искать
//  номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
//  однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//  Желательно не добавлять
//  лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
//  Консоль использовать только для вывода результатов проверки телефонного справочника.


public class MainClassPhone {

    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Ivanov", "+7(963)635-68-95");
        telephoneBook.add("Ivanov", "+7(963)635-63-95");

//        telephoneBook.getPhoneNumberBySurname("Ivanov");

        telephoneBook.getAllSurname().
                forEach(e ->
                        System.out.println("[" + e + "] - " + telephoneBook.getPhoneNumberBySurname(e)));

    }
}
