package org.java.course.lection_1.animals;

import java.util.concurrent.atomic.AtomicInteger;

public class Bear extends Animal {
    private static final AtomicInteger COUNTERDog =
            new AtomicInteger(1);
    private final int idBear;
    int bearCounter;

    public Bear(String name, String color, int age) {
        super(name, color, age);
        idBear = COUNTERDog.getAndIncrement();
        bearCounter++;
    }

    @Override
    public void info() {
        System.out.println("Name: " + name + "; Color: " + color + "; Age: "
                + age + "; " + idBear + endOfNumberDog(idBear) + " собака");
    }

    private String endOfNumberDog(int idBear) {
        if (idBear == 3) {
            return "-ий";
        } else if (idBear == 2 || idBear == 6 ||
                idBear == 7 || idBear == 8) {
            return "-ой";
        } else
            return "-ый";
    }

    @Override
    public void voice() {
        System.out.println(name + ": бэр-бэр");
    }

    @Override
    public void run(int bearDistance) {
        Animal.limitDistanceRun = 10000;
        super.run(bearDistance);
    }

    @Override
    public void swim(int bearDistanceSwim) {
        Animal.limitDistanceSwim = 100000;
        super.swim(bearDistanceSwim);
    }

    @Override
    public void getCounter() {
        System.out.println("Количество медведей с мишками = " + bearCounter);
    }
}
