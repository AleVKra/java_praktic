package org.java.course.lesson2.homeTask_2_progress;

public class Cat implements Participant {

    String type = Type.CAT.getTitle();
    String catName;
    final double catMaxHeight;
    final double catMaxLength;


    public Cat(String catName) {
        this.catName = catName;
        catMaxHeight = 4;
        catMaxLength = 150;
    }


    @Override
    public boolean jamp(double height) {
        Type.CAT.getTitle();
        if (height < 0) {
            noCorrect();
            return false;
        } else if (catMaxHeight <= height) {
            System.out.println(height +
                    " слишком высоко для " + this.toString());
            return false;
        } else {
            System.out.println(this.toString() +
                    " прыгнул " + height + " метров");
            return true;
        }
    }

    @Override
    public boolean running(double length) {
        Type.CAT.getTitle();
        if (length < 0) {
            noCorrect();
            return false;
        } else if (catMaxLength <= length) {
            System.out.println(length +
                    " слишокм высоко,  " + this.toString());
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
        return type + " по имени " + catName;


    }
}
