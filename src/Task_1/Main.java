package Task_1;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 101));
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        long count = IntStream.of(arr).filter(x -> x % 2 == 0).count();
        System.out.println("Even numbers count: " + count);

    }
}