package array;
import java.util.*;
import java.util.Arrays;
/*
public class PascalTriangle {
	
	static int[][]getArray(int n)
	{
		int [][]a= new int[n][];
		for (int i = 0; i < a.length; i++) {
			a[i]=new int[i+1];
			
			
			k
		}
		a[0][0]=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				if(j==0||i==j)
					a[i][j]=1;
				else
					a[i][j]=a[i-j][j-1]+a[i-1][j];
		}
		}
		return a;
	}
	static void display(int [][]a)
	{
		int space=25;
		for(int[]b:a) {
			for(int i=1;i<=space;i++)
				System.out.print(" ");
		for(int n:b)
		{
			System.out.print(n+" ");
			
		}
		System.out.println();
		space--;
	}
	}
	
	
	public static void main(String[] args) {
		int [][]a=getArray(5);
		display(a);
		
		
		
	}

}*/
import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String args[])
	{
	    int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}



