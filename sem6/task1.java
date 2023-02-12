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
        Notebook n1 = new Notebook();
        n1.id = 1;
        n1.madeIn = "China";
        n1.model = "MSI";
        n1.ram = 16;
        n1.hdd = 512;
        n1.os = "Windows";
        n1.prise = 85000;

        Notebook n2 = new Notebook();
        n2.id = 2;
        n2.madeIn = "China";
        n2.model = "Apple MacBook";
        n2.ram = 8;
        n2.hdd = 256;
        n2.os = "macOS";
        n2.prise = 100000;

        Notebook n3 = new Notebook();
        n3.id = 3;
        n3.madeIn = "USA";
        n3.model = "HP";
        n3.ram = 32;
        n3.hdd = 1024;
        n3.os = "Windows";
        n3.prise = 480000;

        Notebook n4 = new Notebook();
        n4.id = 4;
        n4.madeIn = "Taiwan";
        n4.model = "Asus";
        n4.ram = 16;
        n4.hdd = 512;
        n4.os = "Windows";
        n4.prise = 135000;

        Notebook n5 = new Notebook();
        n5.id = 5;
        n5.madeIn = "China";
        n5.model = "Acer";
        n5.ram = 8;
        n5.hdd = 256;
        n5.os = "Linux";
        n5.prise = 40000;

        HashSet<Notebook> model = new HashSet<Notebook>(Arrays.asList(n1, n2, n3, n4, n5));
        HashSet<Notebook> ram = new HashSet<Notebook>(Arrays.asList(n1, n2, n3, n4, n5));

        switch (userMenu()) {
            case (1):
                printCatalog(model);
                break;
            case (2):
                switch (filterMenu()) {
                    case (1):
                        switch (filterModelMenu()) {
                            case (1):
                                printFilterModelCatalog(model, "MSI");
                                break;
                            case (2):
                                printFilterModelCatalog(model, "Apple MacBook");
                                break;
                            case (3):
                                printFilterModelCatalog(model, "HP");
                                break;
                            case (4):
                                printFilterModelCatalog(model, "Asus");
                                break;
                            case (5):
                                printFilterModelCatalog(model, "Acer");
                                break;
                        }
                        break;
                    case (2):
                        switch (filterRamMenu()) {
                            case (1):
                                printFilterRamCatalog(ram, 8);
                                break;
                            case (2):
                                printFilterRamCatalog(ram, 16);
                                break;
                            case (3):
                                printFilterRamCatalog(ram, 32);
                                break;  
                        }
                        break;
                }
                break;
            case (0):
                break;
        }
    }

    static void printCatalog(HashSet<Notebook> catalog) {
        for (Notebook notebook : catalog) {
            System.out.println(notebook.toString());
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
        System.out.println("Введите цифру, соответствующую критерию поиска:\n 1 - модель \n 2 - размер оперативная память");
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
