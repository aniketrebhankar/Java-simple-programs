package array;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		Book[] arr= new Book[4];
		arr[0]= new Book(100);
		arr[1]=new Book(300);
		arr[2]= new Book(500);
		arr[3]= new Book(200);
		Arrays.sort(arr);
		for(Book b:arr)
		{
			System.out.println(b);
		}
		
	}

}
