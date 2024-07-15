package src.main.java.org.java.course.lection_1.lesson2.lection_2.exampleButtonAnonimClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleButton {

    public static void main(String[] args) {
//   пример создания кнопок в swing, первые две - плохой вариант,
//   т.к. создание каждой кнопки влечёт за собой создание нового класса
        JButton button1 = new JButton("Btn 1");
        JButton button2 = new JButton("Btn 2");
        JButton button3 = new JButton("Btn 3");

        button1.addActionListener(new Button1Action());
        button2.addActionListener(new Button2Action());
//  для того чтоб не создавать доп классов, можно вызвать интерфейс непосредвтсено
//        с переопределением соответствующего метода и его реализацией.
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(3);
            }
        });
//        аналогичный пример по многопоточности:
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++) {
                    System.out.println(1);
                    try {
                        Thread.sleep(400);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

//        функциональный интерфейс, у которго только один метод
    }
}