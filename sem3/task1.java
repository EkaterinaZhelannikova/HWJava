//Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

package Sem3;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i, rand.nextInt(100));
        }
        System.out.println("Список чисел: " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Список чисел без четных: " + list + "\n");
    }
}
