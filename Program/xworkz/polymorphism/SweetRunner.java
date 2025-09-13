package xworkz.polymorphism;

public class SweetRunner {
    public static void main(String[] args){
        Sweet sweet = new jilebi();
        System.out.println(sweet instanceof Champakali);
        System.out.println(sweet instanceof jilebi);
        //instance of
        Champakali champakali = (Champakali) sweet;

    }
}
