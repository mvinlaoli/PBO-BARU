package pbo.utspbo.controller;

import java.util.ArrayList;
import java.util.List;

import pbo.utspbo.view.mainView;
import pbo.utspbo.model.deviceType;
import pbo.utspbo.model.handphone;
import pbo.utspbo.model.komputer;
import pbo.utspbo.model.laptop;
import pbo.utspbo.utility.inputUtil;

public class deviceController {
    private List<deviceType> daftardevice = new ArrayList<>();
    private mainView view = new mainView();

    public void start() {
        int opsi;
        do {
            view.tampilkanMenuUtama();
            opsi = inputUtil.getInt("Pilih Opsi : ");
            switch (opsi) {
                case 1 -> tambahDevice();
                case 2 -> printSemuaDevice();
                case 3 -> System.out.println("Terimaksih");
                default -> System.out.println("Opsi Salah");

            }
        } while (opsi != 3);

    }

    private void tambahDevice() {
        view.tampilkanMenuTambahDevicen();
        int tipe = inputUtil.getInt("Pilih tipe");

        switch (tipe) {
            case 1 -> {
                String brand = inputUtil.getString("Masukan brand : ");
                String model = inputUtil.getString("Masukan model : ");
                String os = inputUtil.getString("Masukan os : ");
                int ramssize = inputUtil.getInt("Masukan ramsize : ");
                int storagesize = inputUtil.getInt("Masukan stogasize : ");

               
                daftardevice.add(new handphone(brand, model, os, ramssize, storagesize));
                System.out.println("Handphone Berhasil di Tambahkan ");
            }
            case 2 -> {
                String brand = inputUtil.getString("Masukan brand : ");
                String model = inputUtil.getString("Masukan model : ");
                String os = inputUtil.getString("Masukan os : ");
                int ramssize = inputUtil.getInt("Masukan ramsize : ");
                int storagesize = inputUtil.getInt("Masukan stogasize : ");
                daftardevice.add(new laptop(brand, model, os, ramssize, storagesize));
                System.out.println("Laptop Berhasil di Tambahkan ");


            }
            case 3 ->{
                String brand = inputUtil.getString("Masukan brand : ");
                String model = inputUtil.getString("Masukan model : ");
                String os = inputUtil.getString("Masukan os : ");
                int ramssize = inputUtil.getInt("Masukan ramsize : ");
                int storagesize = inputUtil.getInt("Masukan stogasize : ");
                String cpu = inputUtil.getString(":Masukan cpu :");
                String gpu = inputUtil.getString(":Masukan cpu :");
                daftardevice.add(new komputer(brand, model, os, ramssize, storagesize, cpu, gpu));
                System.out.println("Komputer Berhasil di Tambahkan ");

            }
            default -> System.out.println("Tipe tidak di kenali ");
            
        }

    }
    private void printSemuaDevice(){
        if (daftardevice.isEmpty()) {
            System.out.println("\nBelum ada Device");
            return;
            
        }
        System.out.println("\n===Daftar Device===");
        for(deviceType d : daftardevice){
            System.out.println(d.getPrintDetail());
        }
    }
}
