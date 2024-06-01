package org.java.course;

public class Duck implements Swimable, SuperFlyable {

    public void fly() { // при переопределении переопределится метод родителя!
        System.out.println("Утка летит");
    }

    public void superFly() {

    }
    public void swim() {

    }


}
