package org.java.course.lesson2.homeTask_2_progress;

import lombok.Getter;
import lombok.Setter;
import org.java.course.lesson2.homeTask_2_noResalt.Type;

@Getter
@Setter
public class Robot implements Participant {
    String type = Type.ROBOT.getTitle();
    String robotName;
    final double maxHeightRobot;
    final double maxLengthRobot;

    public Robot(String robotName) {
        this.robotName = robotName;
        maxHeightRobot = 3.0;
        maxLengthRobot = 500.1;
    }

    @Override
    public boolean jamp(double height) {
        Type.ROBOT.getTitle();
        if (height < 0) {
            noCorrect();
            return false;
        } else if (maxHeightRobot <= height) {
            System.out.println(height +
                    " слишком высоко для " + this.toString());
            return false;
        } else {
            System.out.println(this.toString() +
                    " перепрыгнул " + height + " метров");
            return true;
        }
    }

    @Override
    public boolean running(double length) {
        Type.ROBOT.getTitle();
        if (length < 0) {
            noCorrect();
            return false;
        } else if (maxLengthRobot <= length) {
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
        return type + " по имени " + robotName;
    }

}
