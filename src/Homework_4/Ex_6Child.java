package Homework_4;

public class Ex_6Child extends Ex_6Parent{
    Ex_6Child(){
        super();
    }

    public void mainDiagonalProduct(){

        int product = 1;

        for(int i = 0; i < 4; i++){
            product *= matrix[i][i];
        }

        System.out.println("Main diagonal product = " + product);
    }

}
