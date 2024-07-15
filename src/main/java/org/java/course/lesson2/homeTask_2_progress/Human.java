package org.java.course.lesson2.homeTask_2_progress;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human implements Participant {
    String type = Type.HUMAN.getTitle();
    String name;

    double maxHeight;
    final double maxLength;

    public Human(String name) {
        this.name = name;
        maxHeight = 2.0;
        maxLength = 50.0;
    }

    @Override
    public boolean jamp(double height) {
        Type.HUMAN.getTitle();
        if (height < 0) {
            noCorrect();
            return false;
        } else if (maxHeight <= height) {
            System.out.println(height +
                    " слишком высоко для " + this.toString());
            return false;
        } else {
            System.out.println(this.toString() +
                    " перепрыгнул " + height + " метр.");
            return true;
        }
    }

    @Override
    public boolean running(double length) {
        Type.HUMAN.getTitle();
        if (length < 0) {
            noCorrect();
            return false;
        } else if (maxLength <= length) {
            System.out.println(length +
                    " слишокм высоко для " + this.toString());
            return false;
        } else {
            System.out.println(this.toString() +
                    " пробежал " + length + " метров.");
            return true;
        }
    }

    private void noCorrect() {
        System.out.println(this.toString() +
                " не корректно введено значение!");
    }

    @Override
    public String toString() {
        return type + " по имени " + name;
    }

}
