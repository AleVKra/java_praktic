package org.java.course.lesson3.homeTask_3;

public class MyArraySizeException {

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

    public MyArraySizeException(int row, int column, int[][] array) {
        super("Invalid data in [" + row + "; " + column + "]: " + array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }

}
