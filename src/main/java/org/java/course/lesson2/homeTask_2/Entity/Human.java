package src.main.java.org.java.course.lection_1.lesson2.homeTask_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.java.course.lesson2.homeTask_2.Obstacle.*;

@Setter
@Getter
public class Human implements Wall, TreadMill, Participant {

    String name;
    double maxValue;

    public Human(String name, double maxValue) {
        this.name = name;
        this.maxValue = maxValue;
    }

    @Override
    public void run(double distance) {
        double maxDistance = maxValue;
        if (distance <= maxDistance) {
            System.out.println(name + " (Человек) " + " пробоежал дистанцию");
        } else
            System.out.println(name + " (Человек) " + "Не смог пробежать дистанцию");
    }

    @Override
    public void jump(double height) {
        double maxHeight = maxValue;
        if (height <= maxHeight) {
            System.out.println(name + " (Человек) " + " перепрыгнул стену");
        } else
            System.out.println(name + " (Человек) " + " Не смог перепрыгнуть высоту");
    }
}