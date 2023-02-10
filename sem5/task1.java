//Реализуйте структуру телефонной книги с помощью HashMap, 
//учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in, "cp866")) {
            Map<String, ArrayList<String>> directory = new HashMap<>();

            while (true) {
                ArrayList<String> numbers = new ArrayList<>();
                System.out.printf("Введите имя: ");
                String name = iScanner.next();
                System.out.printf("Введите кол-во номеров у пользователя: ");
                int count = iScanner.nextInt();

                for (int i = 0; i < count; i++) {
                    System.out.printf("Введите номер: ", i);
                    String number = iScanner.next();
                    numbers.add(number);
                }

                directory.put(name, numbers);
                System.out.printf("Хотите продолжить да(0)/нет(1): ");
                int changeCompleted = iScanner.nextInt();

                if (changeCompleted == 1) {
                    break;
                }
            }
            System.out.println(directory);
        }
    }
}
