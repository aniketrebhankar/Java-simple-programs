import java.util.Scanner;

class Primenumber 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scn.nextInt();
		if(n==0)
		{
			System.out.println("neither prime nor composite");
			return;
		}
		if(n==1)
		{
			System.out.println("not a prime number");
			return;

		}
		int a=1;

		for(int i=2;i<=n/2;i++){
			if(n%i==0)
		   {
			a=0;
			System.out.println("not a prime number");
			break;

		}
		}
		if(a==1)
		{
			System.out.println("prime number");
		}

	}
}
