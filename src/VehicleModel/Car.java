package VehicleModel;

public class Car extends Vehicle{
    private String brand;
    private String model;
    private int serialNumber;

    public Car(String brand,int serialNumber,double engine ){
        super(engine);
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public Car(String brand, String model, String type, double engine){
        super(type, engine);
        this.brand = brand;
        this.model = model;
    }
    public Car(){

    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setSerialNumber(int serialNumber){
        if (serialNumber > 0)
            this.serialNumber = serialNumber;
    }
    public int getSerialNumber(){
        return serialNumber;
    }

    public void transportation(){
        System.out.println("transportation of people");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + getType() + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + getEngine() + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
