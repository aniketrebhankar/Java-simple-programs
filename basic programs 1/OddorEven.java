import java.util.Scanner;
class OddorEven 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the number");
		int n = scn.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
}
