package string.demo;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String name1 = "Devanshu";//string constant pool same hash as name 3
		String name3 = "Devanshu";//scp same hash as name 1
		String name2 = new String("Devanshu");//heap diff hash for every obj
		String name4 = new String("Devanshu");//heap
		System.out.println(name2.equals(name4));
		System.out.println(name2.equalsIgnoreCase(name4));

		StringBuffer sc = new StringBuffer("Devanshu");
		sc.append(" Das");// instead of concat
		System.out.println(sc);
		
		sc.reverse();
		System.out.println(sc);
		
		//SBuff is thread safe or synchronize
		//SBuil is not ---||---(used for multi-threading)

	}

}
