package org.java.course.lesson2.lection_2.exampleButtonAnonimClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(2);
    }
}
