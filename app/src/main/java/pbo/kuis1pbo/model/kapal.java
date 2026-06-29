package pbo.kuis1pbo.model;
import pbo.kuis1pbo.enums.jenisKapal;
public class kapal extends kendaraan {
    private int lebar;
    private int panjang;
    private jenisKapal jenis;

    public kapal(String model, int kapasitas, int lebar, int panjang, jenisKapal jenis) {
        super(model, kapasitas);
        this.lebar = lebar;
        this.panjang = panjang;
        this.jenis = jenis;
    }

    // Method Overloading Constructor (Tanpa nama model, default ke jenis kapal)
    public kapal(int kapasitas, int lebar, int panjang, jenisKapal jenis) {
        this("Kapal", kapasitas, lebar, panjang, jenis);
    }

    public int getLebar() { return lebar; }
    public int getPanjang() { return panjang; }
    public jenisKapal getJenis() { return jenis; }

    @Override
    public String getPrintDetail() {
        return "Kapal " + jenis.toString().toLowerCase() + " dengan lebar " + lebar + 
               " meter dan panjang " + panjang + " meter punya kapasitas " + getKapasitas() + " orang";
    }
}
