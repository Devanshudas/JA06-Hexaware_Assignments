package set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		Set<String> set = new TreeSet<String>();
		//Set<String> set = new HashSet<String>();
		
		set.add("Devanshu");
		set.add("Das");
		set.add("Adam");
		set.add("Fox");
		System.out.println(set); 
		// will print on the basis of hashcode not alphabetically/Insertion order and to take any element as hashcode whe have to override tostring(), hashcode() and .equals() method. 
		// hashcode are key so not to use decimal (Use string and int to use as hashcode )
		// tree set will not accept from class which doers not have comparable operator
	}

}
