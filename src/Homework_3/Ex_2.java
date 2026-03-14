package Homework_3;

public class Ex_2 {
    public int[][] matrix = new int[5][5];

    Ex_2(){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }

    public void printMatrix(){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int sumAbove(){
        int sum = 0;
        for (int i =0; i< 5; i++){
            for (int j=0; j<5; j++){
                if (i < j){
                    sum += matrix[i][j] * matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int sumBelow(){
        int sum = 0;
        for (int i =0; i< 5; i++){
            for (int j=0; j<5; j++){
                if (i > j){
                    sum += matrix[i][j] * matrix[i][j];
                }
            }
        }
        return sum;
    }
}



