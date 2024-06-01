package org.java.course.lection_1.animals;

import java.util.concurrent.atomic.AtomicInteger;

public class CatAnimal extends Animal {
    private static final AtomicInteger COUNTERCat =
            new AtomicInteger(1);
    private final int idCatAnimal;
    private int clawsLenght;
    static int catCounter;

    public CatAnimal(String name, String color, int age, int clawsLenght) {
        super(name, color, age);
        this.clawsLenght = clawsLenght;
        catCounter++;
        idCatAnimal = COUNTERCat.getAndIncrement();
    }

    @Override
    public void voice() {
        System.out.println(name + ": говорит ... mau");
    }

    @Override
    public void run(int catDistance) {
        limitDistanceRun = 250;
        super.run(catDistance);
    }

    @Override
    public void getCounter() {
        System.out.println("Количество котов и кошек = " + catCounter);
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("Коты с кошками не умеют плавать!!!");
    }

    @Override
    public boolean catEquals(Object obj) {
        return super.catEquals(obj);
    }
}
