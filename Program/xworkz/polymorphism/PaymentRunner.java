package xworkz.polymorphism;

public class PaymentRunner {
    public static void main(String[] args){
        CreditCardPayment   creditCardPayment = new CreditCardPayment();
        creditCardPayment.makePayment(10000);

        UpiPayment upiPayment = new UpiPayment();
        upiPayment.makePayment(1000);


    }
}
