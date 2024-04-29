package lesson43.homework;

public class HomeWork43 {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = calculateArray(array);
            System.out.println("Sum of array elements: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Array size is not 4x4");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessageDetails());
        }
    }

    static int calculateArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sumArr = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Array size is not 4x4");
        }
        for (int row = 0; row < array.length; row++) {
            if (array[row].length != 4) {
                throw new MyArraySizeException("Array size is not 4x4");
            }
            for (int column = 0; column < array[row].length; column++) {
                String element = array[row][column];
                try {
                    sumArr += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data at: ",row, column);
                }
            }
        }
        return sumArr;
    }
}
