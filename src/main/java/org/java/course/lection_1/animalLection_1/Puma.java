package org.java.course.lection_1.animalLection_1;

public class Puma extends Cat {
    public static int pumaCount;

    public Puma(String name, int maxRunDistance, int maxSwimDistance) {
        super("Puma ", name, maxRunDistance, maxSwimDistance);
        pumaCount++;
    }
}
