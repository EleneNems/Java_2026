package Homework_4;

public class Ex_2Parent {
    public int[] C = new int[17];

    Ex_2Parent(){
        for (int i = 0; i<17; i++){
            C[i] = (int)(Math.random() * 100);
        }
    }

    public void printArray(){
        for (int i =0;i<17;i++){
            System.out.print(C[i] + " ");
        }
    }
}
