package prp;
import java.util.*;
public class Evenodd {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if((n&1)==0)
		{
			System.out.println("Even number");
		}
		else 
		{
			System.out.println("odd number");
		}
		s.close();

	}

}
