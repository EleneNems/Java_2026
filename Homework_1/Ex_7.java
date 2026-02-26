import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<100 || num>999){
            System.out.println("Please enter a number more than 100 and less than 999!");
            return;
        }
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        int num2 = c * 100 + b * 10 + a;

        System.out.println(num2);
    }
}
