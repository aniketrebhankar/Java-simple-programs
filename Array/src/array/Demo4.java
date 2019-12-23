package array;
import java.util.Arrays;

class Student implements Comparable{
	String name;
	int rollnumber;

Student(String n, int r)
{
	name =n;
	rollnumber= r;
	
	}
public int compareTo(Object x)
{
	Student s=(Student)x;
	String s1= name;
	String s2=s.name;
	return s1.compareTo(s2);
	
	
	
}

public String toString()
{
	return name+" , "+rollnumber;
}



}
public class Demo4 {

	public static void main(String[] args) {
		Student [] arr= new Student[4];
		arr[0]= new Student("Aniket",300);
		arr[1]= new Student("Deepak",200);
		arr[2]= new Student("Bala",100);
		arr[3]= new Student("krishna",230);
		Arrays.sort(arr);
		for(Student s:arr)
		{
			System.out.println(s);
		}
		
		

	}

}
