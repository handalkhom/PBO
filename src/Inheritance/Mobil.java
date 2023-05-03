package Inheritance;

public class Mobil extends Kendaraan {
    private String nama;

    public Mobil(String nama) {
        super("Mobil");
        this.nama = nama;
    }

    public void melaju() {
        System.out.println("Sebuah " + nama + " melaju dengan cepat.");
    }
}