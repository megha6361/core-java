class Laptop1
{
String name;
float price;
int  storage;
String features;
public Laptop1() {	
}
public static void main(String[] args)
{
Laptop laptop = new Laptop();
laptop.name = "Lenovo";
System.out.println(laptop.name);
laptop.setName("HP");
System.out.println(laptop.name);

Laptop laptop1 = new Laptop();
laptop1.setName("Dell");
System.out.println(laptop1.name);
System.out.println(laptop.name);

Laptop laptop2 = new Laptop();
laptop2.price = "30f";
System.out.println(laptop2.price);
laptop2.setPrice("40");
System.out.println(laptop1.price);
System.out.println(laptop2.price);

}
public void setPrice(String laptopprice)
{
	Age = laptopPrice;
}
}