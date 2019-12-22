import java.util.Scanner;

class Test5 {
public static void main(String[] args) {
	int val = 0;
	Scanner scn = new Scanner(System.in);
	int temp = 0;
	val = scn.nextInt();
	int temp1 = 0;
	for(int i = 1;i<=val;i++) 
	{
		temp = i; temp1 = val; 
		
		for(int j = i;j<=val;j++) {
			
			System.out.print(temp+" ");
			temp+=temp1--;
			
		}
		System.out.println();
	
		for(int k = 0;k<i;k++)
		{
			System.out.print(" ");
			}
	}
}

}
