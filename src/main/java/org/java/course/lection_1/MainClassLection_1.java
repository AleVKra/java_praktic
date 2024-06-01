package org.java.course.lection_1;

import org.java.course.lection_1.animalLection_1.Leon;
import org.java.course.lection_1.animalLection_1.Animal;
import org.java.course.lection_1.animalLection_1.HouseCat;
import org.java.course.lection_1.animalLection_1.Puma;

public class MainClassLection_1 {

    public static void main(String[] args) {

        Animal[] animals = {
        new Puma("Люся", 10000, 5000),
                new Leon("лева", 1500, 1000),
                new HouseCat("Вася", 2000, 0)
        };

        for (Animal o : animals) {
            o.run(600);
            o.swim(1500);
        }
    }
}
