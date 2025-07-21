class AnimalRunner
{
public static void main(String[] args)

{
Animal animal = new Animal();
System.out.println(animal.getName());
animal.setName("tiger");
String name = animal.getName();
System.out.println(name);

}
}