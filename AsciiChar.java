package code;

public class AsciiChar {

	public static void main(String[] args) 
	{
		String str;
		for(int i=0;i<255;i++)
		{
			str=new Character((char)i).toString();
			System.out.println(i+" "+str);
		}
	

	}

}
