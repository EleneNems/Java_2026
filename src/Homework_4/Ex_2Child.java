package Homework_4;

public class Ex_2Child extends Ex_2Parent{
    public double oddAverage(){
        int sum=0;
        int count=0;

        for (int i=0;i<17;i+=2){
            count++;
            sum += C[i];
        }

        return (double) sum/count;
    }
}
