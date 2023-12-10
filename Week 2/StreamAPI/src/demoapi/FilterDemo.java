package demoapi;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FilterDemo 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,20,50,80,90};
		IntStream stream = Arrays.stream(arr);
		
		// stream.limit(4).forEach(System.out::println);
		
		//stream.distinct().forEach(System.out::println);
		
		//stream.skip(4).forEach(System.out::println);
		
/*		OptionalInt op1 = stream.reduce((a,b)->{return a+b;});
		
		if(op1.isPresent())
		{
			int result = op1.getAsInt();
			System.out.println("Result from reduce: "+result);
		}
		
		else
		{
			System.out.println("No result found");
		}
*/
		int result = stream.reduce((a,b)->{return a+b;}).orElse(0); // if do not want to use optional
		System.out.println("Result from reduce: "+result);
	}
	

}

		