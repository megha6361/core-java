package xworkz.polymorphism;

public class FallsRunner {
    public static void main(String[] args){
        Falls falls = new AbbeFalls();
        System.out.println(falls instanceof jogFalls);
        System.out.println(falls instanceof AbbeFalls);

        AbbeFalls abbeFalls = (AbbeFalls) falls;
        jogFalls jogFalls = (jogFalls) falls;
    }
}
