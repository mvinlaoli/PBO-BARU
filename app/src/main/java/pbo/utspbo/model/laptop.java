package pbo.utspbo.model;

public class laptop extends deviceType implements powerAble, updateAble,ramRecable,storageRecable {
    public laptop(String brand, String model, String os, int ramSize, int storageSize) {
        super(brand, model, os, ramSize, storageSize);

    }

    @Override
    public String getPrintDetail() {
         return "- Laptop " + getBrand() + "Model " + getModel() + " OS " + getOs() + "Ramsize " + getRamsize()
                + " Storagesize " + getStorageSize();
       
        
    }

    @Override
    public void replaceStorage(int storageSize) {
       storageSize = 512;
    }

    @Override
    public void replaceRAM(int ramSize) {
        ramSize = 8;
      
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void turnON() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnON'");
    }

    @Override
    public void turnOFF() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOFF'");
    }


    
}
