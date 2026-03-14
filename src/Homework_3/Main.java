package Homework_3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 2:");
        Ex_2 matrix = new Ex_2();

        matrix.printMatrix();

        int above = matrix.sumAbove();
        int below = matrix.sumBelow();
        System.out.println("Sum above: " + above);
        System.out.println("Sum below: " + below);

        if(above > below)
            System.out.println("Above sum is greater");
        else if(below > above)
            System.out.println("Below sum is greater");
        else
            System.out.println("Both sums are equal");

        System.out.println("Exercise 4:");
        Ex_4 Array = new Ex_4();
        System.out.println("Array:");
        Array.PrintArray();

        Array.SortArray();

        System.out.println("Sorted Array:");
        Array.PrintArray();
    }
}