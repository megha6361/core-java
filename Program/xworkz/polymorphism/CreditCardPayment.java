package xworkz.polymorphism;

public class CreditCardPayment extends payment{
    public void makePayment(int amount){
        System.out.println("Making payment using credit card of amount is " + amount);
    }
}
