package array;
import java.lang.Comparable;
class Book
{
	int pages;
	public Book(int i) {
	
	}
	public int CompareTo(Object x) {
		int p1=pages;
		int p2=((Book)x).pages;
		return p1-p2;
	}
	}

public class Demo1 {

	public static void main(String[] args) {
	Book b1= new Book(100);
	Book b2= new Book(200);
	System.out.println(b1.CompareTo(b2));
	String s1="java";
	String s2="android";
	System.out.println(s1.compareTo(s2));
	
	}

}
