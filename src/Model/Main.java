package Model;

import VehicleModel.Bike;
import VehicleModel.Car;
import VehicleModel.HybridCar;

public class Main {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar("Toyota", 1533,
                "Silver Calcium Battery","AC",1.1);
        System.out.println(hybridCar);
    }

}
