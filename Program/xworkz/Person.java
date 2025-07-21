class Person
{
static String name;
static String address;
static long mobile = 6775432214L;

public static void main(String[] args)
{
//String name =;
name = "megha";
System.out.println("name" );
System.out.println(address);
//String address=;
System.out.println("address" + address);
address = "banglore";
System.out.println("address" + address);
System.out.println(mobile);
String mobile=;
System.out.println("mobile" + mobile);
mobile = "6775432214";
System.out.println("mobile"+ mobile);

drive();
Person.drive();
System.out.println(Person.name);
}

public static void drive()
{
System.out.println("The " + name + "Person" + address + "mobile");
}
}