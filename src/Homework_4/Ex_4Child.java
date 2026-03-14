package Homework_4;

public class Ex_4Child extends Ex_4Parent {
    public void findMaxRow(){
        int maxSum = 0;
        int maxRow = 0;

        for (int i = 0;i<4;i++){
            int sum = 0;
            for (int j=0;j<4;j++){
                sum += matrix[i][j] * matrix[i][j];
            }
            System.out.println("Row " + i + " square sum = " + sum);

            if(sum > maxSum){
                maxRow = i;
                maxSum = sum;
            }
        }

        System.out.println("Row with largest square sum: " + maxRow);

        System.out.println("Elements of that row:");

        for(int j = 0; j < 4; j++) {
            System.out.print(matrix[maxRow][j] + " ");
        }
    }
}
