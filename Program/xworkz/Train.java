class Train
{
 private String name;
 private int cost;
 private int speed;
 
public static int length;
 static
 {
	 System.out.println("static Block");
	 length =100;
 }
 {
	System.out.println("non static block");
	length = 200;
 }
 
 public void setName(String trainName)
 {
 name = trainName;
 }
 
 public void setCost(int trainCost)
 {
 cost = trainCost;
 }
 
 public void setSpeed(int trainSpeed)
 {
	 cost =  trainSpeed;
 }
 
 public String getName()
 {
	 return name;
 }
 
 public int getCost()
 {
	 return cost;
 }
 
 public int getSpeed()
 {
	 return speed;
 }
}