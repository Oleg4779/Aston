public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"8", "1", "3", "5"}, {"1", "8", "9", "4"},
                {"3", "0", "1", "8"}, {"4", "0", "3", "1"}};

        try {
            System.out.println(arrayTest(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Array size should be 4*4!");
        } catch (MyArrayDataException e) {
            System.out.println("Wrong data type in cell " + e.i + "*" + e.j);
        }
    }

    public static int arrayTest(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static void printArray(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
