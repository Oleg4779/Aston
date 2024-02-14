public class Main {
    public static void main(String[] args) {
        System.out.println("--- Task #1 ---");
        System.out.println(checkSum(1, 20));
        System.out.println("--- Task #2 ---");
        checkNumber(-1);
        System.out.println("--- Task #3 ---");
        System.out.println(checkNegativeNumber(3));
        System.out.println("--- Task #4 ---");
        printString("Hello!", 5);
        System.out.println("--- Task #5 ---");
        System.out.println(checkYear(1904));
        System.out.println("--- Task #6 ---");
        changeArray();
        System.out.println("--- Task #7 ---");
        hundredArray();
        System.out.println("--- Task #8 ---");
        multipleArrayMembers();
        System.out.println("--- Task #9 ---");
        changeArrayDiagonal();
        System.out.println("--- Task #10 ---");
        System.out.println(createArray(5, 3));
    }

    //task #1

    public static boolean checkSum(int a, int b) {
        boolean result;
        if ((a + b) >= 10 && (a + b) <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //task #2

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    //task #3

    public static boolean checkNegativeNumber(int a) {
        boolean result;
        if (a < 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //task #4

    public static void printString(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    //task #5

    public static boolean checkYear(int a) {
        boolean result;
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //task #6

    public static void changeArray() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

//        loop to output modified array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //task #7

    public static void hundredArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

//        loop to output a filled array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //task #8

    public static void multipleArrayMembers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

//        loop to output modified array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //task #9

    public static void changeArrayDiagonal() {
        int[][] arr = {{5, 7, 3, 2, 9, 6}, {7, 0, 3, 9, 7, 5}, {8, 9, 0, 4, 7, 2}, {2, 5, 7, 0, 3, 6}, {4, 6, 2, 0, 7, 9}, {6, 5, 9, 2, 4, 3}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || (i + j) == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }

//        loop to output modified array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //task #10

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;

    }
}
