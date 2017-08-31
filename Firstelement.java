package prp;
import java.util.*;
public class Firstelement {

	public static void main(String[] args) 
	{
		int c=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(c==1)
				
					continue;
				if(a[i]==a[j])
				{
					c=1;
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

}
