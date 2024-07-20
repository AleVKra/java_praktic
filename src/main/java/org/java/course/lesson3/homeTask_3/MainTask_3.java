package org.java.course.lesson3.homeTask_3;

public class MainTask_3 {


    public static void main(String[] args) {

        String[][] arr = {
                {"1", "1", "jop", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        MyArraySizeException myArraySizeException = new MyArraySizeException(arr);
        myArraySizeException.sizeArray(arr);
        MyArrayDataException myArrayDataException = new MyArrayDataException();
        myArrayDataException.sumTwoArray(arr);
    }


}
