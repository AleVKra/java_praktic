package org.java.course.lection_1.animalLection_1;

public class Cat extends Animal {
    public static int catCount;

    public Cat(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        catCount++;
    }
}
