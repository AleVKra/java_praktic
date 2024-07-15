package src.main.java.org.java.course.lection_1.lesson2.lection_2;

public class Calendar {
    Month month = Month.AUGUST;


    public void currentDateInfo(){
//        Month.values();

        System.out.println(month.getNumber() +
                " " + month.getTitle());
    }
}
