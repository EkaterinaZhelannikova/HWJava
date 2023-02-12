package Sem6;

public class Notebook {
    int id;
    String madeIn;
    String model;
    int ram;
    int hdd;
    String os;
    int prise;

    @Override
    public String toString() {
        return String.format(
            "id: %d, Made in: %s, Model: %s, RAM: %d Gb, HD: %d Gb, OS: %s, Prise: %d руб",
            id, madeIn, model, ram, hdd, os, prise);
    }
}