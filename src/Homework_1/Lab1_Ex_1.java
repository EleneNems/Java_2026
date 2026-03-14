package Homework_1;

public class Lab1_Ex_1 {
    public static void main(String[] args){
        byte b;
        long i=1120;
        b=(byte)i;
        System.out.println("b=" + b);
        System.out.println("i-s mnishvnelobis nashtia: "+(i%128));
        long l=0xfffffl;
        System.out.println(l);
        i=l;
        System.out.println("i="+i);
        double d=1.2E2;
        double f=d;
        System.out.println("f="+f);
        char c=(char)d;
        System.out.println("c="+c);
        i=c;
        System.out.println("i="+i);
    }

}
