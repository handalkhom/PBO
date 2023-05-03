package Abstraction;

class Kuliah extends MataKuliah {
    private String dosen;
    
    public Kuliah(String nama, int sks, String dosen) {
        super(nama, sks);
        this.dosen = dosen;
    }
    
    public String getDosen() {
        return dosen;
    }
    
    @Override
    public void info() {
        System.out.println("Mata kuliah: " + getNama());
        System.out.println("SKS: " + getSks());
        System.out.println("Dosen: " + getDosen());
    }
}
