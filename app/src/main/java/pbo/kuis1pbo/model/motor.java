package pbo.kuis1pbo.model;
import pbo.kuis1pbo.model.kendaraan;
public class motor extends kendaraan {
    private String nomorPolisi;
    private int roda;

    public motor(String model, String nomorPolisi, int kapasitas, int roda) {
        super(model, kapasitas);
        this.nomorPolisi = nomorPolisi;
        this.roda = roda;
    }

    public motor(String model, String nomorPolisi, int kapasitas) {
        this(model, nomorPolisi, kapasitas, 2);
    }

    public String getNomorPolisi() { return nomorPolisi; }
    public int getRoda() { return roda; }

    @Override
    public String getPrintDetail() {
        return "Motor " + getModel() + " dengan nomor polisi " + nomorPolisi + 
               " punya " + roda + " roda dan punya kapasitas " + getKapasitas() + " orang.";
    }
}
