
class Add
{
public static void add(int a, int b)
{
int c = a + b;
System.out.println(c);
}
public static void add()
{
int a = 5, b = 15;
int c = a + b;
System.out.println(c);
}
public static void main(String[] args)
{
add();
add(10,20);
}
}