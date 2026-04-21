package Classwork_1;

public abstract class Transport {
    String brand;
    int speed;

    public Transport(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void move();

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}