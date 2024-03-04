package Task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phonebook;

    public PhoneBook() {
        phonebook = new HashMap<>();
    }

    public void add(String name, String number) {
        List<String> numbers;
        if(phonebook.containsKey(name)) {
            numbers = phonebook.get(name);
        } else {
            numbers = new ArrayList<>();
        }
        numbers.add(number);
        phonebook.put(name, numbers);
    }

    public List<String> get(String name) {
        return phonebook.get(name);
    }
}
