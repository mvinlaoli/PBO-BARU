package pbo.kuis1pbo.model;
import pbo.kuis1pbo.model.kendaraan;
public class helikopter extends kendaraan {
    private String penggunaan; 

    public helikopter(String model, int kapasitas, String penggunaan) {
        super(model, kapasitas);
        this.penggunaan = penggunaan;
    }

    public helikopter(int kapasitas, String penggunaan) {
        this("Helikopter", kapasitas, penggunaan);
    }

    public String getPenggunaan() { return penggunaan; }

    @Override
    public String getPrintDetail() {
        return "- Helikopter " + penggunaan + " dengan kapasitas " + getKapasitas() + " orang";
    }
}