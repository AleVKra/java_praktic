package org.java.course.lesson3.homeTask_3;

import java.util.Arrays;

public class MyArraySizeException extends RuntimeException {


    public MyArraySizeException(String[][] array) {

        super("Invalid size array " + Arrays.deepToString(array) +
                " должен не превышать 4-х строк и 4-х столбцов!");
    }

    void sizeArray(String[][] array) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[j].length > 4 || array[i].length > 4) {
                    throw new MyArraySizeException(array);
                }
            }
        }
    }
}
