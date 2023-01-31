//Реализовать простой калькулятор (операции + - / * )
//Пример работы программы:
//Введите число 1: 2
//Введите число 2: 3
//Введите операцию: +
//Ответ: 5
//Введите число 1: 2
//Введите число 2: 3
//Введите операцию: а
//Ответ: Такой операции нет

package Sem1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите 1-е число: ");
        double a = iScanner.nextDouble();
        System.out.printf("Введите 2-е число: ");
        double b = iScanner.nextDouble();
        System.out.printf("Введите операцию: ");
        String symbol = iScanner.next();
        calculator(a, b, symbol);
        iScanner.close();
    }
    static void calculator(double a, double b, String symbol) {
        double res = 0;
        switch (symbol) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "/":
                res = a / b;
                break;
            case "*":
                res = a * b;
                break;
            default:
                System.out.println("Такой операции нет");
                return;
        }
        System.out.print("Ответ: ");
        System.out.printf(a + " " + symbol + " " + b + " = " + res);
    }
}
