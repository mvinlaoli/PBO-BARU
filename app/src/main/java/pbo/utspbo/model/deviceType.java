package pbo.utspbo.model;

public  abstract class deviceType {
    private String brand;
    private String model;
    private String os;
    private int ramSize; // in GB
    private int storageSize; // in GB

    public deviceType(String brand, String model, String os, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getOs() {
        return os;
    }
    public int getRamsize(){
        return ramSize;
    }
    public int getStorageSize(){
        return storageSize;
    }
    public abstract String getPrintDetail();
    
}
