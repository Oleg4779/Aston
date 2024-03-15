package Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Highload", "High", "Load", "Highload");

//        2.1

        int counter = (int)list.stream().filter(w -> w.contains("High")).count();
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

    }
}
