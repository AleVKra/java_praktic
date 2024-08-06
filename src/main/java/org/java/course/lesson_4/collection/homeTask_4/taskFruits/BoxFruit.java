package org.java.course.lesson_4.collection.homeTask_4.taskFruits;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxFruit<F extends Fruit> {

    private ArrayList<F> container;
    /*для примера, который лучше не использовать
    для сравнения получившего веса и текущего...*/
    private float currentWeight;

    public BoxFruit() {
        this.container = new ArrayList<>();
    }

    public BoxFruit(F... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(F fruit) {
        this.container.add(fruit);
    }

    public void add(F... fruits) {
        this.container.addAll(Arrays.asList(fruits));
    }

    /*получение веса методом...*/
    public float getWeight() {
        if (container.size() == 0) {
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }

    /*метод который стоит использовать для решения задачи..*/
    public boolean compare(BoxFruit<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    /*метод позволяет перемещать фрукты в другой контейнер,
     * имеющийся контейнер очистится
     * по ошибки можно указать ту же коробку, для предупреждения
     * данной ситуации нужно указать условие if
     * */
    public void transfer(BoxFruit<? super F> another) {
        // проверка для того что бы
        if (this == another) {
//            здесь можно выкинуть Exception
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
}