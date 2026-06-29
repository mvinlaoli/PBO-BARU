package pbo.utspbo.model;

import pbo.utspbo.*;;

public class handphone extends deviceType implements powerAble, updateAble, callAble {
    public handphone(String brand, String model, String os, int ramSize, int storageSize) {
        super(brand, model, os, ramSize, storageSize);

    }

    @Override
    public String getPrintDetail() {
        return "- Handphone " + getBrand() + "Model " + getModel() + " OS " + getOs() + "Ramsize " + getRamsize()
                + " Storagesize " + getStorageSize();

    }

    @Override
    public void makeCall() {

    }

    @Override
    public void update() {
    }

    @Override
    public void turnON() {

    }

    @Override
    public void turnOFF() {

    }

}
