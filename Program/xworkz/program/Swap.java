package xworkz.program;

public class Swap {

    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("bs");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //int c = a+b;
       // a=c-a;
        //b=c-d;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
