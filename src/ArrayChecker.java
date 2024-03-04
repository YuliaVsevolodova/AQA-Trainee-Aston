public class ArrayChecker {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = processArray(validArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println("Exeption: " + e.getMessage());
        }

        String[][] invalidArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };
        try {
            int result = processArray(invalidArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println("Exeption: " + e.getMessage());
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeExeption, MyArrayDataExeption {
        int expectedRows = 4;
        int expectedCols = 4;

        if (array.length != expectedRows || !validateColumn(array, expectedCols)) {
            throw new MyArraySizeExeption("Размер массива не равен 4х4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("Неверный формат[" + i + "] [" + j + "]");

                }
            }
        }
        return sum;
    }

    private static boolean validateColumn(String[][] array, int expectedCols) {
        for (String[] row : array) {
            if (row.length != expectedCols) {
                return false;
            }
        }
        return true;
    }
}

class MyArraySizeExeption extends Exception {
    public MyArraySizeExeption(String message) {
        super(message);
    }
}

class MyArrayDataExeption extends Exception {
    public MyArrayDataExeption(String message) {
        super(message);
    }
}