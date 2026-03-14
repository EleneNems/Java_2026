package Homework_4;

public class Ex_4Parent {
    public int[][] matrix = new int[4][4];

    Ex_4Parent(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }

    public void printMatrix(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
