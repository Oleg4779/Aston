package Task_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "45697789");
        phoneBook.add("Petrov", "13265478");
        phoneBook.add("Sverdlov", "65474159");
        phoneBook.add("Kuznecov", "36547895");
        phoneBook.add("Kozlov", "32015010");
        phoneBook.add("Ivanov", "32256489");
        phoneBook.add("Pavlov", "47587412");
        phoneBook.add("Kozlov", "36542125");
        phoneBook.add("Kozlov", "12365877");

        System.out.println(phoneBook.get("Kozlov"));
        System.out.println(phoneBook.get("Ivanov"));
    }
}
