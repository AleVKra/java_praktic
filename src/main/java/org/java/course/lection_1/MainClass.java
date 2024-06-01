package org.java.course.lection_1;

import org.java.course.lection_1.animals.Animal;
import org.java.course.lection_1.animals.Bear;
import org.java.course.lection_1.animals.CatAnimal;
import org.java.course.lection_1.animals.Dog;

public class MainClass {

    public static void main(String[] args) {
//        Animal cat = new Cat("Barsik", "White", 2, 1);
//        Animal dog = new Dog("Buldog", "Black", 2);
//        cat.info();
//        // cat.voice();
//        dog.info();
//        dog.voice();
        System.out.println("========================");
        Animal[] catAndDog = {
//                new Cat("Barsik_1", "Red", 3, 1),
//                new Dog("Buldog", "Black", 3),
                new Dog("Buldog2", "Black", 2),
//                new Cat("Афина", "gray", 3, 1),
                new CatAnimal("Sonya", "белый", 2, 1),
                new CatAnimal("Кот Вася", "серый", 1, 1),
                new Bear("Michael", "brown", 5)
        };

        for (Animal o : catAndDog) {
            o.info();
            o.voice();
            o.run(2000);
            o.swim(35);
            o.getCounter();
        }
    }
}

