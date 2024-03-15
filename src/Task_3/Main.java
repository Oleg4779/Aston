package Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"f10", "a15", "f2", "f4", "f5", "b54", "a16");
        Collections.sort(list2, String::compareTo);
        String[] arr = list2.toArray(new String[0]);

        printArray(arr);
    }

    public static void printArray(String[] arr) {
        for(String s : arr) {
            System.out.println(s + " ");
        }
    }
}
