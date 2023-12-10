package string.demo;

public class StringToken 
{

	public static void main(String[] args) 
	{
		String data = "Hello My Name is Devanshu";
		String arr[]= data.split(" ");
		
		for(String s : arr)
		{
			System.out.println(s);
		}

	}

}
