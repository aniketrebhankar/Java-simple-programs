class ReverseNo 
{
	public static void main(String[] args) 
	{
		int n1=12345, rev=0;
		while(n1!=0)
		{
			rev=(rev*10)+(n1%10);
			n1/=10;
			}
		System.out.print("Reverse number is "+rev);
	}
}
