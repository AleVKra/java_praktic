package src.main.java.org.java.course.lection_1.lesson2.homeTask_2_noResalt;


import java.util.ArrayList;

public class MainClassHome2 {

    public static void main(String[] args) {

        ArrayList<Obstacle> obstacles = new ArrayList<>();

        obstacles.add(new Robot("Vasja", 3.1, 7.3));
        obstacles.add(new Human("Aleksej", 1.3, 15.2));
        obstacles.add(new Cat("Мурка", 1.7, 6.5));

        for (Obstacle o : obstacles) {
            o.jamp(5);
            o.running(10);
            System.out.println(o);
        }
    }
}
