package src.main.java.org.java.course.lection_1.lesson2.lection_2;

public enum Month {

    JANUARY(1), FEBRUARY(2), MARCH(3),
    APRIL(4), MAY(5), JUNE(6), JULE(7),
    AUGUST(8), SEPTEMBER(9), OKTOBER(10),
    NOVEMBER(11), DECEMBER(12);


    //   нумеровка номеров месацев конструктором
    int number;

    public int getNumber() {
        return number;
    }

    // конструктор в Enum только приватный!
    Month(int number) {
        this.number = number;
    }

    public String getTitle() {
        String nameMonth = "";
        switch (number) {
            case 1:
                nameMonth = "ЯНВАРЬ";
                break;
            case 2:
                nameMonth = "ФЕВРАЛЬ";
                break;
            case 3:
                nameMonth = "МАРТ";
                break;
            case 4:
                nameMonth = "АПРЕЛЬ";
                break;
            case 5:
                nameMonth = "МАЙ";
                break;
            case 6:
                nameMonth = "ИЮНЬ";
                break;
            case 7:
                nameMonth = "ИЮЛЬ";
                break;
            case 8:
                nameMonth = "АВГУСТ";
                break;
            case 9:
                nameMonth = "СЕНТЯБРЬ";
                break;
            case 10:
                nameMonth = "ОКТЯБРЬ";
                break;
            case 11:
                nameMonth = "НОЯБРЬ";
                break;
            case 12:
                nameMonth = "ДЕКАБРЬ";
                break;
        }
        return nameMonth;
    }
}
