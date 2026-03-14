package Homework_4;

public class Ex_6Parent {
    int[][] matrix = new int[4][4];

    Ex_6Parent() {

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }

        System.out.println("Matrix created in Parent constructor");
    }

    public void printMatrix(){

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
