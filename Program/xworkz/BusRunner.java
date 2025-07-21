class BusRunner {
public static void main(String[] args)	
{
	
System.out.println("busNumber" + Bus.busNumber);
System.out.println("busSeries" + Bus.busSeries);
System.out.println("busNumber" + Bus.busNumber);
System.out.println("numberOfPassenger" + Bus.numberOfPassenger);
System.out.println("mileage " + Bus.mileage);
System.out.println("bus price " + Bus.price);	
	
int totalPrice = Bus.getTotalPrice(5);
System.out.println("total price of 8 buses  "+ totalPrice);
int totalAmount = Bus.totalAmountInTrip();
System.out.println("totalAmount in a trip  is  "+ totalAmount);
}
}
