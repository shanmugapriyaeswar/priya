package pppppppp;
import java.util.*;
public class Starpat {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
		
	}

}
