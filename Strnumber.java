package priya;
import java.util.*;
public class Strnumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String n1=s.nextLine();
		String n2=s.nextLine();
		int number = Integer.parseInt(n1) * Integer.parseInt(n2);
		System.out.println(Integer.toString(number));
		s.close();

	}

}
