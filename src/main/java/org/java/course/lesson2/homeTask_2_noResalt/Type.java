package src.main.java.org.java.course.lection_1.lesson2.homeTask_2_noResalt;

public enum Type {
    //   вид сущности
    ROBOT(1),
    CAT(2),
    HUMAN(3);


    //   нумеровка номеров типа сущности конструктором
    int number;

    public int getNumber() {
        return number;
    }

    // конструктор в Enum только приватный!
    Type(int number) {
        this.number = number;
    }

    public String getTitle() {
        String nameType = "";
        switch (number) {
            case 1:
                nameType = "РОБОТ";
                break;
            case 2:
                nameType = "КОТ (КОШКА)";
                break;
            case 3:
                nameType = "ЧЕЛОВЕК";
                break;
        }
        return nameType;
    }
}
