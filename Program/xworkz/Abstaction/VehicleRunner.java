package xworkz.Abstaction;

public class VehicleRunner {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Auto();

        Car.move();
        Auto.move();


    }
}
