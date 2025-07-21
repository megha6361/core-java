class BusRunner {
public static void main(String[] args)	
{
	
System.out.println("BusNumber"	+ busNumber);
System.out.println("busSeries" + Bus.busSeries);
System.out.println("busNumber" + Bus.busNumer);
System.out.println("numberOfPassenger " + Bus.numberOfNumber);
System.out.println("mileage " + Bus.mileage);
System.out.println("bus price " + Bus.price);	
	
int totalPrice;	
int totalPrice = Bus.getTotalPrice(5);
System.out.println("total price of 8 buses  "+ totalPrice);
int totalAmount = Bus.totalAmountTrip();
System.out.println("totalAmount in a trip  is  "+ totalAmount);
}
}
