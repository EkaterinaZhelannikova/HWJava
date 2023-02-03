//Создать очередь с помощью LinkedList и реализовать следующие методы:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
//Вызвать полученные методы и убедиться в их работоспособности.

package Sem4;

import java.util.LinkedList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(10));
        }
        System.out.println(list);
        enqueue(list);
        dequeue(list);
        System.out.println(first(list));
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list) {
        int first = list.remove(0);
        list.add(first);
        System.out.println(list);
        return list;
    }

    public static LinkedList<Integer> dequeue(LinkedList<Integer> list) {
        list.remove(0);
        System.out.println(list);
        return list;
    }

    public static int first(LinkedList<Integer> list) {
        return list.get(0);
    }
}
