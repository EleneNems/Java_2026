package Homework_4;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 2:");
        Ex_2Child array = new Ex_2Child();
        array.printArray();
        System.out.println("\nAverage of odd indexe elements: " + array.oddAverage());

        System.out.println("\nExercise 4:");
        Ex_4Child matrix = new Ex_4Child();
        System.out.println("Matrix:");
        matrix.printMatrix();
        matrix.findMaxRow();

        System.out.println("\nExercise 6:");
        Ex_6Child matrix1 = new Ex_6Child();
        System.out.println("Matrix:");
        matrix1.printMatrix();
        matrix1.mainDiagonalProduct();
        System.out.println();

        Ex_6Child_2 matrix2 = new Ex_6Child_2();
        System.out.println("Matrix:");
        matrix2.printMatrix();
        matrix2.secondaryDiagonalProduct();
    }
}