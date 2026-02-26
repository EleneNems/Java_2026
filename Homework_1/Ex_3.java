public class Ex_3 {
    public static void main(String[] args) {
        double a = 2.8;
        double x = 1.5;
        double b = 1;

        double y = (Math.sqrt(Math.log(a+b)+x))/(Math.exp(x) + 1);
        double z = Math.abs(Math.pow(x, 2)-Math.pow(y,2));

        System.out.println(z);

    }
}
