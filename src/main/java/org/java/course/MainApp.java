package org.java.course;

public class MainApp {

   /* минусы такого подхода:
   * - создание дополнительных методов
    * перегрузки для создания метод которые ползволят ездить на ТС */
    static class Human {
        public void drive(Car car) {
            car.run();
        }

        public void drive(Skateboard skateboard) {
            skateboard.runSkate();
        }
        public void drive(Bicycle bicycle) {
          bicycle.running();
        }
    }


    static class Car {
        public void run() {
            System.out.println("машина поехала");
        }
    }

    static class Skateboard {
        public void runSkate() {
            System.out.println("скейт поехал");
        }
    }

    static class Bicycle {
        public void running() {
            System.out.println("велосипед поехал");
        }
    }

    public static void main(String[] args) {

        /*вывод данных */
        Flyable[] flyables = {
                new Duck(),
                new Airplain()

        };

        for (Flyable f : flyables) {
            f.fly();
        }

        Flyable somethingFlyable = new Duck();
        somethingFlyable.fly();
    }

}
