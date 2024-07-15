package src.main.java.org.java.course.lection_1.lesson2.homeTask_2_noResalt;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Human implements Obstacle {
    Type type = Type.HUMAN;
    String name;
    final double maxHeight;
    final double maxLength;

    public Human(String name, double maxHeight, double maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public boolean jamp(double height) {
        if (height < maxHeight) {
            System.out.println(type + name + " взял поставленную высоту");
            return true;
        } else if (height < 0) {
            System.out.println(" Не верное значение, должно быть больше нуля!");
            return true;
        } else if (height == 0) {
            System.out.println(type + name + " стоит на месте, команды прыгать не было!");
            return true;
        }
        return false;
    }

    @Override
    public boolean running(double length) {
        if (length < maxLength) {
            System.out.println(type + name + " пробежал поставленную дистанцию!!!");
            return true;
        }
        if (length < 0) {
            System.out.println("Не должно быть меньше нуля!");
            return true;
        }
        if (length== 0) {
            System.out.println(type + name + "стоит на месте, команды прыгать не было!");
            return true;
        }
        return false;
    }
}
