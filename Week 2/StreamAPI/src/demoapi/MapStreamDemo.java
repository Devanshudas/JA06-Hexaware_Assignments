package demoapi;

import java.util.Arrays;
import java.util.List;

public class MapStreamDemo 
{

	public static void main(String[] args) 
	{
		String names[] = {"Devanshu","Vidhya","Rhea","Ronny","Ray"};
		
		List<String> list = Arrays.asList(names);
		
		list.stream().map((name)->{return name.length();}).forEach((name)->{System.out.println(name);});
	}
}
