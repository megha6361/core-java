class Array
{
	public static void main(String[] args)
	{
		int[] employeeId = new int[5];
		System.out.println(employeeId);
		for(int i=0; i<employeeId.length;i++)
			System.out.println(employeeId[i]);
	}
	employeeId[0] = 1;
	System.out.println(employeeId[0]);
	System.out.println(employeeId[2]);
	for(int i=0;i<employeeId.length;i++)
	{
		employeeId[i] = i+10;
	}
	for(int i=0;i<employeeId.length;i++)
	{
		System.out.println(employeeId[i]);
    }
}

