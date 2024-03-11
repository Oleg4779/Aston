package Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Highload", "High", "Load", "Highload");

//        2.1

        long counter = list.stream().filter(w -> w.equals("High")).count();
        if (counter <= 1) {
            System.out.println("There is " + counter + " word \"High\" in collection.");
        } else {
            System.out.println("There are " + counter + " words \"High\" in collection.");
        }

//        2.2

        String firstElement = list.stream().findFirst().orElse("0");
        System.out.println("The first element of the collection: " + firstElement);

//        2.3

        String lastElement = list.stream().reduce((a, b) -> b).orElse("0");
        System.out.println("The last element of the collection: " + lastElement);

//        3

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "f10", "a15", "f2", "f4", "f5", "b54", "a16");
        Collections.sort(list2, String::compareTo);
        String[] arr = list2.toArray(new String[0]);


        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
