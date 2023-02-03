//Создать LinkedList целых чисел (заполнить случайными числами).
//Реализуйте метод, который вернет “перевернутый” список.

package Sem4;

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        System.out.println(reverse(list));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> resList = new LinkedList<>();
        for (int i = list.size() - 1; i > -1; i--) {
            resList.add(list.get(i));
        }
        return resList;
    }

}
