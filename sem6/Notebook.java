package Sem6;

public class Notebook {
    int id;
    String madeIn;
    String model;
    int ram;
    int hdd;
    String os;
    int prise;

    public Notebook(int id,
            String madeIn,
            String model,
            int ram,
            int hdd,
            String os,
            int prise) {
        this.id = id;
        this.madeIn = madeIn;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.prise = prise;
    }

    public String toString() {
        return String.format(
                "id: %d, Made in: %s, Model: %s, RAM: %d Gb, HD: %d Gb, OS: %s, Prise: %d руб",
                id, madeIn, model, ram, hdd, os, prise);
    }
}
