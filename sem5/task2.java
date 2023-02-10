//Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся 
//имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String namesString = "Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Иван Савин, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] namesArray = namesString.split(", ");
        Map<String, Integer> listWorkers = new HashMap<>();

        for (String name : namesArray) {
            String[] FullName = name.split(" ");
            for (int i = 0; i < FullName.length; i += 2) {
                if (listWorkers.containsKey(FullName[i])) {
                    listWorkers.replace(FullName[i], listWorkers.get(FullName[i]) + 1);
                } else {
                    listWorkers.put(FullName[i], 1);
                }
            }
        }
        listWorkers.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}
