package Homework_1;

public class Ex_1 {
    public static void main(String[] rgs){
        int a = 2;
        int b = 3;
        int c = 4;

        double p = (double) (a + b + c) /2;

        double Area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println(Area);
    }
}
