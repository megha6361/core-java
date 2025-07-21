class  Bus {
static char busSeries = 'A';
static short busNumber = 5467;
static float mileage = 15.3f;
static int price = 500000;
static int numberOfPassenger = 20;
static int ticketPrice = 15;


public static int getTotalPrice(int  numberOfBuses) 
 {
 int totalPrice = price * numberOfBuses;
 return totalPrice;
 }
 public static int totalAmountInTrip()
 {
 int totalAmount = numberOfPassenger * ticketPrice;
 return totalAmount;
 
 }
}
 