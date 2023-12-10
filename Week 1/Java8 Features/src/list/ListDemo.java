package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		// collection takes only obj
		
		List <Object>list = new ArrayList<Object>();//use inteface type obj to hold 
		list.add(100); // internally object creation new Integer(100) using wrapper class
		list.add(4.5); // -------||-------
		list.add(new String("Das"));
		System.out.println(list);
		
		// use generic type<Object,String,Integer>etc (use of wrapper class here)
		 
		//using iterator
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) 
		{
			Object o = it.next();
			System.out.println(o);
			
		}
	}

}
