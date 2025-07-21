class Variable
{
public static void main(String[] args){
addition();
addition(20,30);
}

public static void addition()
{
System.out.println("Calling addition");
int a = 10;
int b = 127;
int c = a + b;
System.out.println(c);
}
//return type - datatype or void
//modifier returtype methodName()
//no argument method

public static void addition(int a, int b)
{
	System.out.println("calling addition no argument");
	int c = a + b;
	System.out.println(c);
}
}
