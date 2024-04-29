package lesson43.homework;

public class MyArrayDataException extends RuntimeException {
    private int row;
    private int column;
    public MyArrayDataException(String message, int row, int column) {
        super(message);
        this.row = row;
        this.column = column;
    }
    public String getMessageDetails() {
        return getMessage() + "Row: " + row + ", Column: " + column;
    }
}
