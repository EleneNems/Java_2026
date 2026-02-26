package Homework_2;

public class Ex_4 {

    public static void main(String[] args) {

        int[][] b = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {2, 4, 6, 8, 10, 12},
                {3, 6, 9, 12, 15, 18},
                {5, 10, 15, 20, 25, 30}
        };

        int[] columnSums = new int[6];

        for (int col = 0; col < 6; col++) {
            int sum = 0;
            for (int row = 0; row < 5; row++) {
                sum += b[row][col] * b[row][col];
            }
            columnSums[col] = sum;
        }

        int maxSum = columnSums[0];
        int maxIndex = 0;

        for (int i = 1; i < 6; i++) {
            if (columnSums[i] > maxSum) {
                maxSum = columnSums[i];
                maxIndex = i;
            }
        }

        System.out.println("Matrix:");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 6; col++) {
                System.out.print(b[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nColumn square sums:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Column " + i + ": " + columnSums[i]);
        }

        System.out.println(maxSum);
        System.out.println(maxIndex);
        System.out.println();

        for (int row = 0; row < 5; row++) {
            System.out.println(b[row][maxIndex]);
        }
    }
}