package VehicleModel;

public class HybridCar extends Car{
    private String generator;
    private String battery;

    public HybridCar(String brand, int serialNumber, String battery, String generator, double engine){
        super(brand,serialNumber,engine);
        this.battery = battery;
        this.generator = generator;
    }

    public void setGenerator(String generator){
        this.generator = generator;
    }
    public String getGenerator(){
        return generator;
    }
    public void setBattery(String battery){
        this.battery = battery;
    }
    public String getBattery(){
        return battery;
    }

    public void charge(){
        System.out.println("Charging battery");
    }
    public void switching(){
        System.out.println("Switching between engine and battery");
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                ", brand='" + getBrand() + '\'' +
                ", serialNumber='" + getSerialNumber() + '\'' +
                ", engine='" + getEngine() + '\'' +
                ", generator='" + generator + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
