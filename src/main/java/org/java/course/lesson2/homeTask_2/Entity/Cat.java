package org.java.course.lesson2.homeTask_2.Entity;

import org.java.course.lesson2.homeTask_2.Obstacle.*;


public class Cat implements Wall, TreadMill{
    private String name;
    private double maxValue;

    public Cat(String name, double maxValue) {
        this.name = name;
        this.maxValue = maxValue;
    }

    @Override
    public void run(double distance) {
        double maxDistance = maxValue;
        if (distance <= maxDistance) {
            System.out.println("Кот пробоежал дистанцию");
        }
        System.out.println("Не смог пробежать дистанцию");
    }

    @Override
    public void jump(double height) {
        double maxHeight = maxValue;
        if (height <= maxHeight) {
            System.out.println("Кот " + name + " перепрыгнул стену");
        }
        System.out.println("Cat " + name + " Не смог перепрыгнуть высоту");
    }
}
