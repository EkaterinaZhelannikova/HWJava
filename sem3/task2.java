//Создать список целых чисел (заполнить случайными числами).
//Найти минимальное, максимальное и среднее из этого списка.

package Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i, rand.nextInt(100));
        }
        System.out.println("Список чисел: " + list);
        int min = Collections.min(list);
        int max = Collections.max(list);
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("Мин: " + min + "\nМакс: " + max + "\nСреднее: " + sum / list.size());

    }
}
