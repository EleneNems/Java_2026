package Homework_4;

public class Ex_6Child_2 extends Ex_6Parent{
    Ex_6Child_2(){
        super();
    }

    public void secondaryDiagonalProduct(){

        int product = 1;

        for(int i = 0; i < 4; i++){
            product *= matrix[i][3 - i];
        }

        System.out.println("Secondary diagonal product = " + product);
    }

}
