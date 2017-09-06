package reference;
import java.util.*;
public class Strdigit {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str.charAt(0)>='0'&&str.charAt(0)<='9')
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		s.close();

	}

}
