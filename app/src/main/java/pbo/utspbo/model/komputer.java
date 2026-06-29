package pbo.utspbo.model;

public class komputer extends deviceType implements powerAble,ramRecable,storageRecable,updateAble , gpuRecable, cpuRecable {
    private String cpu;
    private String gpu;

    public komputer(String brand, String model, String os, int ramSize, int storageSize, String cpu, String gpu) {
        super(brand, model, os, ramSize, storageSize);
        this.cpu = cpu;
        this.gpu = gpu;

    }
    public String getCPU(){
        return cpu;
    }
    public String geGCPU(){
        return gpu;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void replaceStorage(int storageSize) {
       storageSize = 10000000;
    }

    @Override
    public void replaceRAM(int ramSize) {
       ramSize = 10000;
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

    @Override
    public String getPrintDetail() {
         return "- Komputer " + getBrand() + "Model " + getModel() + " OS " + getOs() + "Ramsize " + getRamsize()
                + " Storagesize " + getStorageSize();
      
    }
    @Override
    public void replaceCPU(String cpu) {
       cpu = "INTEL";
    }
    @Override
    public void replaceGPU(String gpu) {
        gpu = "NVIDIA";
    }
   
    
}
    