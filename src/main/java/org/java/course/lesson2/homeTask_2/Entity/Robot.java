package org.java.course.lesson2.homeTask_2.Entity;

import org.java.course.lesson2.homeTask_2.Entity.Participant;
import org.java.course.lesson2.homeTask_2.Obstacle.*;

public class Robot implements Wall, TreadMill {

    String name;
    double maxValue;

    public Robot(String name, double maxValue) {
        this.name = name;
        this.maxValue = maxValue;
    }

    @Override
    public void run(double distance) {
        double maxDistance = maxValue;
        if (distance <= maxDistance) {
            System.out.println("Робот пробоежал дистанцию");
        }
        System.out.println("Не смог пробежать дистанцию");
    }

    @Override
    public void jump(double height) {
        double maxHeight = maxValue;
        if (height <= maxHeight) {
            System.out.println("Робот перепрыгнул стену");
        } else
            System.out.println("Не смог перепрыгнуть высоту");
    }

}
