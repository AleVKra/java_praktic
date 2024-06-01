package org.java.course.lection_1.animalLection_1;

public abstract class Animal {
    public static int count;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(
                    type + " " + name + " успешно пробежал дистанцию!");
        } else {
            System.out.println(type + " " + name + " не пробежал дистанцию!");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type+" "+ name+ " не умеет плавать");
            return;
        }
            if (distance <= maxSwimDistance) {
                System.out.println(
                        type + " " + name + " успешно проплыл дистанцию!");
            } else {
                System.out.println(type + " " + name + " не проплыл дистанцию!");
            }
    }

}
