package array;

public class TestArray4 {
	static void min(int arr[])
	{
		int min=arr[0];
		
			for (int j = 1; j < arr.length; j++) {
			if(min>=arr[j])
			min=arr[j];
	
			System.out.println(min);
			}
			
		
	}

	public static void main(String[] args) {
		int a[]= {33,3,4,5,};
		min(a);
		 
	}

}
