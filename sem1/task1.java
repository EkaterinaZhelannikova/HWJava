//Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n

package Sem1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        System.out.println(sum(n));
        System.out.println(factor(n));
        iScanner.close();
    }
    static int sum(int n) {
        if(n == 1) return 1;
        return n + sum(n - 1);
    }
    static double factor(int n) {
        if(n == 1) return 1;
        return n * factor(n - 1);
    }
}
