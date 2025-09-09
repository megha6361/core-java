package xworkz.polymorphism;

public class NetBankingPayment extends payment{
    public void makePayment(int amount){
        System.out.println("Making payment using NetBanking of amount is" + amount);
    }
}
