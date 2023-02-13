//Создать класс Ноутбук для магазина техники.
//Добавить атрибуты класса с соответствующими типами.
//Например,
//- идентификатор
//- производитель
//- название модели
//- RAM
//- объем HD
//- операционная система
//- цена
//- и т.д.
//Добавить конструктор класса.
//Добавить необходимые методы класса.

package Sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Notebook n1 = new Notebook(1, "China", "MSI", 16, 512, "Windows", 85000);

        Notebook n2 = new Notebook(2, "China", "Apple MacBook", 8, 256, "macOS", 100000);

        Notebook n3 = new Notebook(3, "USA", "HP", 32, 1024, "Windows", 480000);

        Notebook n4 = new Notebook(4, "Taiwan", "Asus", 16, 512, "Windows", 135000);

        Notebook n5 = new Notebook(5, "China", "Acer", 8, 256, "Linux", 40000);

        HashSet<Notebook> catalog = new HashSet<Notebook>(Arrays.asList(n4, n5, n1, n3, n2));

        switch (userMenu()) {
            case (1):
                for (Notebook notebook : catalog) {
                    System.out.println(notebook.toString());
                }
                break;
            case (2):
                switch (filterMenu()) {
                    case (1):
                        switch (filterModelMenu()) {
                            case (1):
                                printFilterModelCatalog(catalog, "MSI");
                                break;
                            case (2):
                                printFilterModelCatalog(catalog, "Apple MacBook");
                                break;
                            case (3):
                                printFilterModelCatalog(catalog, "HP");
                                break;
                            case (4):
                                printFilterModelCatalog(catalog, "Asus");
                                break;
                            case (5):
                                printFilterModelCatalog(catalog, "Acer");
                                break;
                        }
                        break;
                    case (2):
                        switch (filterRamMenu()) {
                            case (1):
                                printFilterRamCatalog(catalog, 8);
                                break;
                            case (2):
                                printFilterRamCatalog(catalog, 16);
                                break;
                            case (3):
                                printFilterRamCatalog(catalog, 32);
                                break;
                        }
                        break;
                }
                break;
            case (0):
                break;
        }
    }

    static void printFilterModelCatalog(HashSet<Notebook> catalog, String model) {
        System.out.printf("Модели ноутбуков %s:", model);
        for (Notebook notebook : catalog) {
            if (model == notebook.model) {
                System.out.println();
                System.out.println(notebook.toString());
            }
        }
    }

    static void printFilterRamCatalog(HashSet<Notebook> catalog, int ram) {
        System.out.printf("Размер оперативной памяти %s:", ram);
        for (Notebook notebook : catalog) {
            if (ram == notebook.ram) {
                System.out.println();
                System.out.println(notebook.toString());
            }
        }
    }

    static int userMenu() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Добро пожаловать в каталог ноутбуков!\n Выберите действие:\n 1 - Печать всех товаров \n 2 - Поиск по каталогу \n 0 - Выход");
        int variator = iScanner.nextInt();

        return variator;
    }

    static int filterMenu() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую критерию поиска:\n 1 - модель \n 2 - размер оперативная память");
        int variator = iScanner.nextInt();

        return variator;
    }

    static int filterModelMenu() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую модели:\n 1 - MSI \n 2 - Apple MacBook \n 3 - HP \n 4 - Asus \n 5 - Acer");
        int variator = iScanner.nextInt();

        return variator;
    }

    static int filterRamMenu() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую размеру оперативной памяти:\n 1 - 8 \n 2 - 16 \n 3 - 32");
        int variator = iScanner.nextInt();

        return variator;
    }
}
