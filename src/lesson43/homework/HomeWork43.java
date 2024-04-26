package lesson43.homework;

public class HomeWork43 {
    public static void main(String[] args) {
    // test1: normal
    // test2: bad size

    }
    static int calculateArray(String[][] strArr) {
        int sumStrArr = 0;
        if (strArr.length > 4) {
            throw new MyArraySizeException("strArr.length > 4");
        }
        for (String[] rowStrArr : strArr) {
            if (rowStrArr.length > 4) {
                throw new MyArraySizeException("strArr.rowStrArr > 4");
            }
        }

        for (int row = 0; row < strArr.length; row++) {
            for (int column = 0; column < strArr[row].length; column++) {
                String element = strArr[row][column];
                try {
                    sumStrArr += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("row: " + row + ", column: " + column + ", bad element: " + element);
                }
            }
        }
        return -1;
    }
}
