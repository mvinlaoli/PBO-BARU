package pbo.kuis1pbo.controller;
import pbo.kuis1pbo.model.*;
import pbo.kuis1pbo.enums.*;
import java.util.ArrayList;
import pbo.kuis1pbo.view.mainView;
import pbo.kuis1pbo.utility.inputUtil;

public class kendaraanController {
    // Polymorphism: Menyimpan berbagai sub-class dalam satu Array/List bertipe Parent (Kendaraan)
    private ArrayList<kendaraan> daftarKendaraan = new ArrayList<>();
    private mainView view = new mainView();

    public void start() {
        int opsi;
        do {
            view.tampilkanMenuUtama();
            opsi = inputUtil.getInt("Pilih opsi: ");
            switch (opsi) {
                case 1 -> tambahKendaraanProses();
                case 2 -> printSemuaKendaraan();
                case 3 -> System.out.println("Terima kasih!");
                default -> System.out.println("Opsi tidak valid!");
            }
        } while (opsi != 3);
    }

    private void tambahKendaraanProses() {
        view.tampilkanMenuTambahKendaraan();
        int tipe = inputUtil.getInt("Pilih tipe: ");

        switch (tipe) {
            case 1 -> { // Motor
                String nopol = inputUtil.getString("Masukkan nomor polisi: ");
                String model = inputUtil.getString("Masukkan model (kharisma, supra, dll): ");
                int kapasitas = inputUtil.getInt("Masukkan kapasitas orang: ");

                // Memanfaatkan Overloading constructor (Otomatis roda diset 2 di dalam objek)
                daftarKendaraan.add(new motor(model, nopol, kapasitas));
                System.out.println("Motor berhasil ditambahkan!");
            }
            case 2 -> { // Mobil
                String nopol = inputUtil.getString("Masukkan nomor polisi: ");
                String model = inputUtil.getString("Masukkan model (teana, hrv, dll): ");
                int kapasitas = inputUtil.getInt("Masukkan kapasitas orang: ");
                String bbmInput = inputUtil.getString("Jenis bahan bakar (diesel/bensin): ").toUpperCase();
                
                jenisbahanBakar bbm = bbmInput.equals("DIESEL") ? jenisbahanBakar.DIESEL : jenisbahanBakar.BENSIN;
                
                // Memanfaatkan Overloading constructor (Otomatis roda diset 4)
                daftarKendaraan.add(new mobil(model, nopol, kapasitas, bbm));
                System.out.println("Mobil berhasil ditambahkan!");
            }
            case 3 -> { // Helikopter
                int kapasitas = inputUtil.getInt("Masukkan kapasitas orang: ");
                String penggunaan = inputUtil.getString("Penggunaan (militer/komersil): ");
                
                daftarKendaraan.add(new helikopter(kapasitas, penggunaan));
                System.out.println("Helikopter berhasil ditambahkan!");
            }
            case 4 -> { // Kapal
                int lebar = inputUtil.getInt("Masukkan lebar (meter): ");
                int panjang = inputUtil.getInt("Masukkan panjang (meter): ");
                String jenisInput = inputUtil.getString("Jenis kapal (layar/mesin): ").toUpperCase();
                int kapasitas = inputUtil.getInt("Masukkan kapasitas orang: ");

                jenisKapal jenis = jenisInput.equals("LAYAR") ? jenisKapal.LAYAR : jenisKapal.MESIN;

                daftarKendaraan.add(new kapal(kapasitas, lebar, panjang, jenis));
                System.out.println("Kapal berhasil ditambahkan!");
            }
            default -> System.out.println("Tipe tidak dikenal!");
        }
    }

    private void printSemuaKendaraan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println("\nBelum ada kendaraan yang terdaftar.");
            return;
        }
        System.out.println("\n=== DAFTAR KENDARAAN ===");
        for (kendaraan k : daftarKendaraan) {
            // Polymorphism memanggil overriding method getPrintDetail() masing-masing kelas
            System.out.println(k.getPrintDetail());
        }
    }
}