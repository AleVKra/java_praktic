package org.java.course.lesson3.homeTask_3;

public class MyArrayDataException extends RuntimeException {

    private int row;
    private int column;
    private Object value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }

    public MyArrayDataException() {
    }

    public MyArrayDataException(int row, int column, String[][] array) {
        super("in the cell [" + row + "; " + column + "]: " + array[row][column] + " it must contain a number!!!");
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }

    void sumTwoArray(String[][] arr) {
        int a;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!isNumber(arr[i][j])) {
                    throw new MyArrayDataException(i, j, arr);
                }
                a = Integer.valueOf(arr[i][j]);
                sum = sum + a;
            }
        }
        System.out.println("the sum of the array is equal to = " + sum);
    }

    public boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
