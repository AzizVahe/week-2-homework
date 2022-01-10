package VehicleModel;

public class Bike extends Vehicle{
    private String helmet;
    private String turbocharging;
    private int maxSpeed;

    public Bike(double engine,int wheels, String turbocharging, int maxSpeed ){
        super(engine,wheels);
        this.turbocharging = turbocharging;
        this.maxSpeed = maxSpeed;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setTurbocharging(String turbocharging) {
        this.turbocharging = turbocharging;
    }

    public String getTurbocharging() {
        return turbocharging;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0 && maxSpeed < 320)
            this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void burnOut(){
        System.out.println("burning the wheel out");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "engine='" + getEngine() + '\'' +
                ", wheels='" + getWheels() + '\'' +
                ", helmet='" + helmet + '\'' +
                ", turbocharging='" + turbocharging + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
