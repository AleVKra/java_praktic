package org.java.course.lection_1.animalLection_1;

public class Dog extends Animal {
    public static int dogCount;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super("Пёс ", name, maxRunDistance, maxSwimDistance);
        dogCount++;
    }
}
