class Metro
{
 private String name;
 private int cost;
 private int speed;
 
 public static String stop;
 static
 {
	 System.out.println("static Block");
	  stop = "abc";
 }
 {
 System.out.println(" non static Block");
	  stop = "def";
 }
 
public void  setName(String metroName)
{
name = metroName;
}

public void setCost(int metroCost)
{
cost = metroCost;
}

public void setSpeed(int metroSpeed)
{
speed = metroSpeed;
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