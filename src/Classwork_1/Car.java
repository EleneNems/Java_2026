package Classwork_1;

public class Car extends Transport implements Fuel {
    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public void move() {
        System.out.println("The car is moving on the road.");
    }

    public void fuelType() {
        System.out.println("Fuel type: Petrol");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Doors: " + doors);
    }
}
