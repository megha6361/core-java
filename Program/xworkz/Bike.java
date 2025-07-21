class Bike
{
static String name;
static String color;
static int speed=60;
static boolean stock;

public static void main(String[] args)
{
//String name ="";
System.out.println("name" + name);
name = "Ktm";
System.out.println("name" + name);
System.out.println(color);
//String color="";
System.out.println("colour" + color);
color = "Red";
System.out.println("color"+ color);
System.out.println(speed);
drive();
Bike.drive();
System.out.println(Bike.name);
System.out.println(stock);
}

public static void drive()
{
System.out.println("The " + name + "Bike" + "is driving with a " + speed + "km");
}
}
