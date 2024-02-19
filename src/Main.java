public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ann", "Developer", "ann@mail.ru", "+3752911234567", 1500, 29);
        System.out.println(employee1.toString());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andrew", "Designer", "andrew@gmail.com", "+375251234567", 1200, 24);
        employees[1] = new Employee("Pete", "QA", "pete@yandex.ru", "+375331234567", 1000, 27);
        employees[2] = new Employee("Kate", "BA", "kate@mail.ru", "+375259876543", 1700, 32);
        employees[3] = new Employee("Anastasia", "Java developer", "nastya@gmail.com", "+375294568798", 2300, 29);
        employees[4] = new Employee("Stephen", "Teamlead", "steph@yandex.ru", "+375251245678", 3200, 38);

        Park park = new Park();
        new Park.Attraction("American mountains", "10:00 - 20:00", 2);
    }
}
