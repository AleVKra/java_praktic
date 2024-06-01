package org.java.course.lection_1.animals;

import java.util.concurrent.atomic.AtomicInteger;

public class Dog extends Animal {
    private static final AtomicInteger COUNTERDog =
            new AtomicInteger(1);
    private final int idDog;
    int dogCounter;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        idDog = COUNTERDog.getAndIncrement();
        dogCounter++;
    }

    @Override
    public void info() {
        System.out.println("Name: " + name + "; Color: " + color + "; Age: "
                + age + "; " + idDog + endOfNumberDog(idDog) + " собака");
    }

    @Override
    public boolean dogEquals(Object obj) {
        return super.dogEquals(obj);
    }

    private String endOfNumberDog(int idDog) {
        if (idDog == 3) {
            return "-ья";
        } else
            return "-ая";
    }


    @Override
    public void voice() {
        System.out.println(name + ": gav-gav");
    }

    @Override
    public void run(int dogDistance) {
        limitDistanceRun = 2500;
        super.run(dogDistance);
    }

    @Override
    public void swim(int dogDistanceSwim) {
        limitDistanceSwim = 50;
        super.swim(dogDistanceSwim);
    }

    @Override
    public void getCounter() {
        System.out.println("Количество собак = " + dogCounter);
    }
}
