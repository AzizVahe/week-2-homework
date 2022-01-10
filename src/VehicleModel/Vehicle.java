package VehicleModel;

public class Vehicle {
    private double engine;
    private int wheels;
    private String type;

    public Vehicle(double engine){
        this.engine = engine;
    }

    public Vehicle(){

    }

    public Vehicle(String type, double engine){
        this.type = type;
        this.engine = engine;
    }

    public Vehicle(double engine, int wheels, String type){
        this.type = type;
        this.wheels = wheels;
        this.engine = engine;
    }

    public Vehicle(double engine, int wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

   public void setEngine(double engine){
        if (engine > 0)
            this.engine = engine;
   }
   public double getEngine(){
       return engine;
   }
   public void setWheels(int wheels){
        if (wheels > 0)
            this.wheels = wheels;
   }
   public int getWheels(){
       return wheels;
   }
   public void setType(String type){
            this.type = type;
   }
   public String getType (){
       return type;
   }

   public void moveForward(){
       System.out.println("moving forward");
   }
   public void moveBackward(){
       System.out.println("moving backward");
   }
   public void turnLeft(){
       System.out.println("turning left");
   }
   public void turnRight(){
       System.out.println("turning right");
   }


}
