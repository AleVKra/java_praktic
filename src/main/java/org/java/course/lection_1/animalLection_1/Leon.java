package org.java.course.lection_1.animalLection_1;

public class Leon extends Cat {
    public static int leonCount;

    public Leon(String name, int maxRunDistance, int maxSwimDistance) {
        super("Leon ", name, maxRunDistance, maxSwimDistance);
        leonCount++;
    }
}
