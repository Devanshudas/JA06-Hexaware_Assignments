package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(33,"Ravi");
		map.put(32,"Rahul");
		map.put(38,"Rajul");
		map.put(47,"Ranveer");
		map.put(48,"Ravina");
		
		// duplicate allowed in values but not keys if any it will replace the previous
		// in link hashmap order is preserved and duplicate allowed
		// tree map will not to sorting for sorting it should implement comparable interface.
		
		
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		System.out.println(map.get(47));
		
		//Retrieve data use iterator / foreach loop
		
		

	}

}
