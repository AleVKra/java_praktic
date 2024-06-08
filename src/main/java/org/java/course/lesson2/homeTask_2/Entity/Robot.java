import org.java.course.lesson2.homeTask_2.Obstacle.*;

public class Robot implements Wall, TreadMill {

    final int maxDistance = 50;
    final int maxHeight = 3;

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Робот пробоежал дистанцию");
        }
        System.out.println("Не смог пробежать дистанцию");
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) {
            System.out.println("Робот перепрыгнул стену");
        }
        System.out.println("Не смог перепрыгнуть высоту");
    }
}
