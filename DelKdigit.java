package priya;
import java.util.*;
public class DelKdigit
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	//	Arrays.sort(a);
		System.out.println("Enter the k digit");
		int k=s.nextInt();
		for(int i=0;i<n-k;i++)
		{
			
		
		System.out.println(a[i]);}
		s.close();
	}

}
