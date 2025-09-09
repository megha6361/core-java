package xworkz.polymorphism;

public class Loan {
    public double calculateInterest(double amount, double rate){
        return(amount * rate)/100;
    }
    public double calculateInterest(double amount, double rate, int years){
        return(amount * rate * years)/100;
    }
}

