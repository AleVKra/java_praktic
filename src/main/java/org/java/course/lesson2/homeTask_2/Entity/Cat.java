import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.java.course.lesson2.homeTask_2.Obstacle.*;


@Getter
@Setter
@AllArgsConstructor
public class Cat implements Wall, TreadMill {
    final int maxDistance = 2;
    final int maxHeight = 2;

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println("Кот пробоежал дистанцию");
        }
        System.out.println("Не смог пробежать дистанцию");
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) {
            System.out.println("Кот перепрыгнул стену");
        }
        System.out.println("Не смог перепрыгнуть высоту");
    }
}
