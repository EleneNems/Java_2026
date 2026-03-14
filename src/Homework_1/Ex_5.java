package Homework_1;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x<100 || x>999){
            System.out.println("Please enter a number more than 100 and less than 999!");
            return;
        }

        int a = x/100;
        int b = (x/10) % 10;
        int c = x % 10;

        int sum = a + b + c;
        System.out.println(sum);
    }
}
