import java.util.Scanner;
class Pattern10 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();
		int spaces=n-1;
		int stars=1;
		for (int i=1;i<n;i++)
		
		{
			int l=1;
			for (int j=1;j<spaces;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=stars;k++)
			{
				System.out.print(l);
				l++;

			}
			System.out.println();
			spaces--;
			stars+=2;

		}
	}
}
