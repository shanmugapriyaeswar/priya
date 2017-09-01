package pppppppp;
import java.util.*;
public class Power {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int sum=n1+n2;
		int res=1;
		for(int i=0;i<sum;i++)
		{
			res=res*sum;
		}
		System.out.println(res);
		s.close();

	}

}
