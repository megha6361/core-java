package xworkz.polymorphism;

public class LoanRunner {
    public static void main(String[] args){
        Loan  loan = new Loan();
        double interest = loan.calculateInterest(10000d, 2.5);
        System.out.println("interest for 1 year of 10000 amount is "+ interest);
        double interest1 = loan.calculateInterest(20000d, 3 , 6);
        System.out.println("interest for 3 years of 20000 amount is " + interest1);
    }
}
