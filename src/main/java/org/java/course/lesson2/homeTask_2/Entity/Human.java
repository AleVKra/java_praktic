package org.java.course.lesson2.homeTask_2.Entity;

import org.java.course.lesson2.homeTask_2.Obstacle.*;

public class Human implements Wall, TreadMill {
    final int maxDistance = 5;
    final int maxHeight = 1;

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Человек пробоежал дистанцию");
        }
        System.out.println("Не смог пробежать дистанцию");
    }

    @Override
    public void jump(int height) {
            if (height <= maxHeight) {
                System.out.println("Человек перепрыгнул стену");
            }
        System.out.println("Не смог перепрыгнуть высоту");
        }
    }