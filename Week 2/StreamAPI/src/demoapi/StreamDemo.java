package demoapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo 
{

	public static void main(String[] args) 
	{
		Integer arr[] = {20,30,40,80,50};
		List list =Arrays.asList(arr); // convert arr to list
		
		Stream <Integer> stream1 = Arrays.stream(arr);//can directly create stream object of an arr
		
		//stream1.forEach((element)->{System.out.println(element);}); // foreach is a termination operation for streamapi
		
		//stream1.forEach(System.out::println); // internally getting converted in avove written line called method reference
		
		Stream <Integer> stream2 = list.stream();
		
		int arr2[] = stream2.filter((element)->{return element>20;}).mapToInt((element)->{return element;}).toArray();
		
		IntStream stream3 = Arrays.stream(arr2); // can use intstream will not need generic type
		stream3.forEach(System.out::println);
		
	}

}
