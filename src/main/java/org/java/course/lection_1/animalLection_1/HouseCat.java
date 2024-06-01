package org.java.course.lection_1.animalLection_1;

public class HouseCat extends Cat {
    public static int houseCatCounter;

    public HouseCat(String name, int maxRunDistance, int maxSwimDistance) {
        super("House Cat ", name, maxRunDistance, maxSwimDistance);
        houseCatCounter++;
    }
}
