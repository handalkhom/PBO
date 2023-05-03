package Inheritance;

public class Kendaraan {
   private String jenis;

   public Kendaraan(String jenis) {
      this.jenis = jenis;
   }

   public void naik() {
      System.out.println("Aku sedang menaiki sebuah " + jenis );
   }
}