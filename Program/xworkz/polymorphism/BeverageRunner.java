package xworkz.polymorphism;

public class BeverageRunner {
    public static void main(String[] args){
        Beverage beverage = new Tea();
        System.out.println(beverage instanceof Tea);
        System.out.println(beverage instanceof Coffee);

        Cafe cafe = new Cafe();
        Beverage beverage1 = cafe.vendingMachine(1);
        Beverage beverage2 = cafe.vendingMachine(2);
        Tea tea = (Tea) beverage2;

    }
}
