package Homework_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_2 {
    static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        Product prod1 = new Product("product1", 12.4);
        Product prod3 = new Product("product3", 15.4);
        Product prod2 = new Product("product2", 10.4);
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);

        System.out.println("MENU");
        System.out.println("1. Add Product");
        System.out.println("2. Delete Product");
        System.out.println("3. Search Product");
        System.out.println("4. Sort Products");

        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
        reader.nextLine();

        if(choice==1){
            System.out.println("Enter Product Name:");
            String prodName = reader.nextLine();
            System.out.println("Enter Product Price:");
            double prodPrice = reader.nextDouble();
            Product newProd = new Product(prodName, prodPrice);
            products.add(newProd);
            System.out.println("Added successfully!");

        } else if (choice==2) {
            System.out.println("Enter Product Name:");
            String prodName = reader.nextLine();

            boolean found = false;

            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().equals(prodName)){
                    products.remove(i);
                    System.out.println("Deleted the product");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Product not found!");
            }

        } else if (choice==3) {
            System.out.println("Enter Product Name:");
            String prodName = reader.nextLine();
            boolean found = false;

            for (Product product : products) {
                if (product.getName().equals(prodName)) {
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("Product was found");
            }
            else{
                System.out.println("Product wasn't found");
            }

        } else if (choice == 4) {
            products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
            System.out.println("Sorted by name:");
            for (Product p : products) {
                System.out.println(p.getName() + " - " + p.getPrice());
            }
        }
        else {
            System.out.println("Please enter a valid choice!");
        }
    }
}

