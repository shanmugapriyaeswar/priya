package priya;

import java.util.*;

public class StrRever {
	public static void main(String args[])

	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		StringBuffer sb=new StringBuffer(str);
	
		System.out.println(" "+sb.reverse());
	}

}
