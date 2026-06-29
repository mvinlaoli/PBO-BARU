package pbo.kuis1pbo.model;
import pbo.kuis1pbo.enums.jenisbahanBakar;
import pbo.kuis1pbo.model.kendaraan;

public class mobil extends kendaraan {
    private String nomorPolisi;
    private int roda;
    private jenisbahanBakar bahanBakar;

    public mobil(String model, String nomorPolisi, int kapasitas, int roda, jenisbahanBakar bahanBakar) {
        super(model, kapasitas);
        this.nomorPolisi = nomorPolisi;
        this.roda = roda;
        this.bahanBakar = bahanBakar;
    }

    
    public mobil(String model, String nomorPolisi, int kapasitas, jenisbahanBakar bahanBakar) {
        this(model, nomorPolisi, kapasitas, 4, bahanBakar);
    }

    public String getNomorPolisi() { return nomorPolisi; }
    public int getRoda() { return roda; }
    public jenisbahanBakar getBahanBakar() { return bahanBakar; }

    @Override
    public String getPrintDetail() {
        return "Mobil " + getModel() + " dengan nomor polisi " + nomorPolisi + 
               " punya " + roda + " roda dan kapasitas " + getKapasitas() + 
               " orang menggunakan bahan bakar " + bahanBakar.toString().toLowerCase();
    }
}