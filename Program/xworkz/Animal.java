class Animal {
private String name;
private int age;

public Animal()
{
	System.out.println("no argument constructor/ default constructor");
	this.name = "lion";
}
public void setName(String name)
{
this.name = name;
}

public String getName()
{
return name;
}

public void setAge(int age)
{
this.age = age;
}

public int getAge()
{
	return age;
}
}