package org.java.course.lection_1.animals;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public abstract class Animal {
    String name;
    String color;
    int age;
    static int counter;
    static int limitDistanceRun;
    static int limitDistanceSwim;


    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        counter++;
    }

    public void getCounter(){
        System.out.println(counter);
    }

    public void swim(int distanceSwim) {
        if (distanceSwim>=0 && distanceSwim <= limitDistanceSwim) {
            System.out.println(name + " проплыл " + " "
                    + distanceSwim + " метров");
        } else {
            System.out.println(name +
                    " не плавает на такую дистанцию!");
        }
    }

    public void run(int distance) {
            if (distance >= 0 && distance <= limitDistanceRun) {
                System.out.println(name + " пробежал(-a) " + " " + distance + " метров");
            } else if (distance >= limitDistanceRun) {
                System.out.println(name + " не бегает на такую дистанцию!");
            } else {
                System.out.println(name + " значение не может быть отрицательным!!! ");
            }
    }

    public void info() {
        System.out.println(name + " " + color + " " + " " + age);
    }

    public void voice() {
        System.out.println(name + " voice ");
    }

    public boolean dogEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }
        Animal another = (Dog) obj;
        return this.name.equals(another.name)
                && this.color.equals(another.color);
    }

    public boolean catEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatAnimal)) {
            return false;
        }
        Animal another = (CatAnimal) obj;
        return this.name.equals(another.name)
                && this.color.equals(another.color);
    }
}
