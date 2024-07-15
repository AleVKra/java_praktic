package src.main.java.org.java.course.lection_1.lesson2.homeTask_2;

import org.java.course.lesson2.homeTask_2.Entity.*;
import org.java.course.lesson2.homeTask_2.Obstacle.Wall;

public class MainClass_Home2 {

    public static void main(String[] args) {

        Human[] humans = {
                new Human("Степан", 1.2),
                new Human("Вася", 1.5),
        };

        for (Human o : humans){
         o.run(1.3);
        }
    }
}
