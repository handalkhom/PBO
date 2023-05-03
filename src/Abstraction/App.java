package Abstraction;

public class App {
    public static void main(String[] args) {
        MataKuliah mk1 = new Kuliah("PBO", 3, "Ichsan Budiman");
        MataKuliah mk2 = new Kuliah("Praktikum PBO", 1, "Insan Al-amin");

        mk1.info();
        mk2.info();
    }
}
