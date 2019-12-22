import java.util.Scanner;
class Pattern9 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();
		int x=n;
		int y=n;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<2*n ;j++ )
			{
				if(j>=x && j<=y)
					System.out.print(" *");
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
			y++;

		}
	}
}
