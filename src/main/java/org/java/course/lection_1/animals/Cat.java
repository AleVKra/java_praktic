package org.java.course.lection_1.animals;

import java.util.concurrent.atomic.AtomicInteger;

public class Cat extends Animal {
    private static final AtomicInteger COUNTERCat =
            new AtomicInteger(1);
    private final int idCat;
    private int clawsLenght;
    private int limitDistance = 250;

    public Cat(String name, String color, int age, int clawsLenght) {
        super(name, color, age);
        this.clawsLenght = clawsLenght;
        idCat = COUNTERCat.getAndIncrement();
    }


    @Override
    public void info() {
        System.out.println("Name: " + name +
                "; Color: " + color + "; Age: " + age +
                "; clawsLenght: " + clawsLenght + "; " + idCat
                + endOfNumber(idCat) + " кот ");
    }

    public void voice() {
        System.out.println(name + ": говорит ... mau");
    }
    private String endOfNumber(int idCat) {
        if (idCat == 2 || idCat == 6
                || idCat == 7 || idCat == 8) {
            return "-ой";
        }
        if (idCat == 3) {
            return "-ий";
        } else
            return "- ый";
    }

}