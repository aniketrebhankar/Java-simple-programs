class facto 
{

	public static void main(String[] args) 
	{
		int num=5;
		long factorial=multiplynumber(num);
		System.out.println("Factorial of a "+ num + " = " +factorial);
	
	}
	public static long multiplynumber(int num)
	{
		if(num>=1)
			return num * multiplynumber(num-1);	
		else
			return 1;

	}
}
