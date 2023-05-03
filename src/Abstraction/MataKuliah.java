package Abstraction;

abstract class MataKuliah {
    private String nama;
    private int sks;
    
    public MataKuliah(String nama, int sks) {
        System.out.println("ppp");
        this.nama = nama;
        this.sks = sks;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getSks() {
        return sks;
    }
    
    public abstract void info();
}
