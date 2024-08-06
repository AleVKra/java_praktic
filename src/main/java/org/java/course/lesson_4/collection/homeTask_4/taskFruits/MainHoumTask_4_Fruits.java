package org.java.course.lesson_4.collection.homeTask_4.taskFruits;

import java.util.ArrayList;

public class MainHoumTask_4_Fruits {

    public static void main(String[] args) {

        BoxFruit<Apple> boxApple = new BoxFruit<>(new Apple());
        BoxFruit<Orange> boxOrange = new BoxFruit<>(new Orange());
        BoxFruit<Fruit> boxFruit = new BoxFruit<>();

        boxApple.add();
        boxApple.add();

        boxApple.transfer(boxApple);
        boxOrange.transfer(boxOrange);
        boxFruit.transfer(boxFruit);

//		applBox.transfer(boxOrange);    // видно, что дженерики запрещают ложить апельсины в коробку для яблок
//		fruitBox.transfer(boxApple);  // видно, что дженерики запрещают ложить апельсины в коробку для фруктов

    }
}
