package priya;

import java.util.*;

public class Lcparr {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int a=Math.min(s1.length(),s2.length());
		for(int i=0;i<a;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.substring(0, i));
			}
		}
		System.out.println(s1.substring(0,a));
		s.close();

	}

}
