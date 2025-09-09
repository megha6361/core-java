package xworkz.polymorphism;

public class BankRunner {
    public static void main(String[] args){
        Bank sbi = new Sbi("9:30 to 4");
        System.out.println("rate of interest for sbi is" +sbi.getRateOfInterest());
        System.out.println("timing of sbi is" + sbi.timing);
        Bank axis = new Axis();
        System.out.println("rate of interest for Axis is " + axis.getRateOfInterest());
        System.out.println("timing of axis is" + axis.timing);
    }
}
