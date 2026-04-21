package Homework_5;

public class Product {
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Name: " + this.name + ", Price: " + this.price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}