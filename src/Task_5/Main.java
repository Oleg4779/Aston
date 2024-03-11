package Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        while (true) {
            String login = scn.nextLine();
            if(login.equals("")) {
                break;
            }
            logins.add(login);
        }
        logins.stream().filter(login -> login.startsWith("f")).forEach(System.out::println);
    }
}
