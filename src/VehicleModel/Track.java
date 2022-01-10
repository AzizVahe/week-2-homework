package VehicleModel;

public class Track extends Vehicle{
    private String trailer;
    private int sleepingPlace;

    public Track(String type,String trailer, int sleepingPlace, double engine, int wheels){
        super(engine, wheels,type);
        this.trailer = trailer;
        this.sleepingPlace = sleepingPlace;
    }

    public void setTrailer(String trailer){
        this.trailer = trailer;
    }
    public String getTrailer(){
        return trailer;
    }

    public void setSleepingPlace(int sleepingPlace){
        if (sleepingPlace > 0 && sleepingPlace <= 2)
            this.sleepingPlace = sleepingPlace;
    }
    public int getSleepingPlace(){
        return sleepingPlace;
    }

    public void cargo(){
        System.out.println("Cargo transportation");
    }

    @Override
    public String toString() {
        return "Track{" +
                "type='" + getType() + '\'' +
                ", engine='" + getEngine() + '\'' +
                ", wheels='" + getWheels() + '\'' +
                ", trailer='" + trailer + '\'' +
                ", sleepingPlace=" + sleepingPlace +
                '}';
    }
}
