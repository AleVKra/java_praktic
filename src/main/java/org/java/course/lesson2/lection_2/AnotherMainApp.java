package src.main.java.org.java.course.lection_1.lesson2.lection_2;

/*
ПРАВИЛО:
ВНУТРЕННИЙ КЛАСС имеет доступ к ПОЛЯм И МЕТОДам ВНЕШНЕГО КЛАССА,
ВНЕШНИЙ КЛАСС НЕ ИМЕЕТ ДОСТУПА К ПОЛЯМ И МЕТОДАМ ВНУТРЕННЕГО КЛАССА.
 */

public class AnotherMainApp {
//  вложенный класс чрез static и может вызываться отдельно от внешнего класса
//    static class Inner

    // внутренний класс не может вызываться от внешнего класса,
// т.к. привязан к внешнему классу.
    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            outerMethod();  // может вызвать метод внешнего класса
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);  // не может вызвать !!!
//        innerMethod();  // не может вызвать !!!
        Inner inner = new Inner(10);

    }

    public static void main(String[] args) {
        // не создастся экземпляр класса
//        Inner inner = new Inner(10); }
//  привязка внутреннего объекта через внешний объект с вызовом
        Inner inner = new AnotherMainApp().new Inner(10);

//    локальные классы
        class Point {
            int x;

            public Point(int x) {
                this.x = x;
            }

            public void info() {
                System.out.println(x);
            }
        }
        Point point = new Point(10);

    }
}

// все эти классы нужны для группировки кода.


//  Анонимный вложенный класс

class Anonim {
    public static void main(String[] args) {
        Flyable flyable=new Flyable() {
            @Override
            public void fly() {

            }
        };
// Вывод в консоли: org.java.course.lesson2.lection_2.Anonim$1
        System.out.println(flyable.getClass().getSimpleName());
    }
}
