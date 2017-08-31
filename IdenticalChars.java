package prp;
import java.util.*;
public class IdenticalChars {

	public static void main(String[] args) 
	{		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==(str.charAt(i+1)))
			{
				String a=str.substring(0, i+1);
				String b=str.substring(i+1);
				str=a+'*'+b;
			}
		}
		System.out.println(str);
		s.close();
		}
}
