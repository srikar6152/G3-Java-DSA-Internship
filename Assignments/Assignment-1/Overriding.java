package week1.assignment;

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running smoothly");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.run(); 

        Vehicle myCar = new Car();
        myCar.run(); 
    }
}
