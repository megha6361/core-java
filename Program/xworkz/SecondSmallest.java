class SecondSmallest
 {
public static void main(String[] args) 
{
int[] arr = {40, 30, 10, 50, 20};
int smallest = arr[0];
int secondSmallest = arr[1];
for (int i = 1; i < arr.length; i++) 
{
if (arr[i] < smallest)
{
secondSmallest = smallest;
smallest = arr[i];
} else if (arr[i] < secondSmallest && arr[i] != smallest) 
s{
secondSmallest = arr[i];
}
}
System.out.println("Second Smallest: " + secondSmallest);
}
}