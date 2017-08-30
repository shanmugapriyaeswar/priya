package priya;
import java.util.*;
public class RepeatWord {

	public static void main(String[] args) 
	{
		char a,c=' ';
		int count=0,sum=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		for(int i=0;i<len-1;i++)
		{
			a=str.charAt(i);
			for(int j=i+1;j<len;j++)
			{
				
				if(a==str.charAt(j))
				{
					count++;
				}
			}
			if(count>sum)
			{
				sum=count;
				c=a;
			}
		}
		System.out.println("Reapeating character is "+c);
		s.close();

	}

}
