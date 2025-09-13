package xworkz.polymorphism;

public class Sbi extends Bank {
    public String name;
    public Sbi(){
}
        public Sbi(String timing){
         this.timing = timing;
        }
        public float getRateOfInterest(){
            return 7.0f;
        }
    }
