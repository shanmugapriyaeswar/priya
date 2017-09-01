package pppppppp;
import java.util.*;
public class Starmat {

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
		
	}

}
