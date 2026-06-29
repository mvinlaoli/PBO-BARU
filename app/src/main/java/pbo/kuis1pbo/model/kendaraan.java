package pbo.kuis1pbo.model;

public abstract class kendaraan {
    private String model;
    private int kapasitas;

    // Constructor Utama
    public kendaraan(String model, int kapasitas) {
        this.model = model;
        this.kapasitas = kapasitas;
    }

   
    public kendaraan() {
        this("Unknown", 0);
    }
    

    public String getModel() { return model; }
    public int getKapasitas() { return kapasitas; }

    public abstract String getPrintDetail();
}