package xworkz.polymorphism;

public class BankRunner {
    public static void main(String[] args) {
        //up casting - conversion of child class to parent class
        Bank bank = new Sbi("9:30 to 4");
        System.out.println("rate of interest for sbi is" + bank.getRateOfInterest());
        System.out.println("timing of sbi is" + bank.timing);
        Bank axis = new Axis();
        System.out.println("rate of interest for Axis is " + axis.getRateOfInterest());
        System.out.println("timing of axis is" + axis.timing);
     //   System.out.println(bank.name);
        System.out.println(bank.id);


//Down casting not possible from direct parent to child class
   //     Sbi sbi = new bank();
//in case up casting you can access all members of parent class
//but you can access specific members of child class which  is override method
        System.out.println(bank instanceof Sbi);
        if (bank instanceof Sbi) {
            Sbi sbi = (Sbi) bank;
            //Downcasing
            //we can do direct down casting
            //if we wat to do  downcasting , first we need to up casting
        //and then downcasting (instanceof)
        System.out.println(sbi.name);
        }
    }
}