package Task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Звезда", "Игра", "Вода", "Улей", "Часы",
                "Звезда", "Взлёт", "Интервью", "Спектакль", "Форма",
                "Край", "Взлёт", "Песок", "Очки", "Вода",
                "Свет", "Звезда", "Фигура", "Платье", "Спектакль", "Вихрь"};

        HashSet<String> hashSet = new HashSet<>();
        for (String word : array) {
            hashSet.add(word);
        }
        System.out.println(hashSet);

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : array) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }

        for (String word : hashMap.keySet()) {
            System.out.println("Word \"" + word + "\" repeats " + hashMap.get(word) + " times");
        }

    }
}
