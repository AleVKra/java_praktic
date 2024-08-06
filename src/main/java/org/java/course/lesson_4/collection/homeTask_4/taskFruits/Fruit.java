package org.java.course.lesson_4.collection.homeTask_4.taskFruits;

import java.util.ArrayList;

public abstract class Fruit<F> {
    float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    private ArrayList<F> fruits = new ArrayList<F>();

    public void setFruits(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    //    метод позволяет сложить фрукты в коробку определённого вида
    public ArrayList<F> foldBox(F fruit) {
        fruits.add(fruit);
        return fruits;
    }
}