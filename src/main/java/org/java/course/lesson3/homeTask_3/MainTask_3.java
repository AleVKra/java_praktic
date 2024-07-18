package org.java.course.lesson3.homeTask_3;

public class MainTask_3 {


    public static void main(String[] args) {

        String[][] arr = {
                {"1", "2", "3", "5", "6"},
                {"1", "2", "3", "5", "6"},
                {"1", "2", "3", "5", "6"},
                {"1", "2", "3", "5", "6"}
        };

        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j].length > 4 || arr[i].length > 4) {
                    throw new MyArraySizeException(arr);
                }
            }
        }
    }
}
