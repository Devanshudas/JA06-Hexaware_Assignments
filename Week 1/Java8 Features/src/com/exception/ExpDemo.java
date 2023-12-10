package com.exception;

public class ExpDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("Open File");
		System.out.println("Update File");
		try
		{
			int res = ExpDemo.div(4, 2);
			System.out.println(res);
			
			String name = null;
			System.out.println(name.length()); // reff holding null cannot call any method
		}
		catch(ArithmeticException e) // e hold arith excp obj and arithexcp is class
		{
		 e.printStackTrace(); // predefined print for excp stack	
		}
		catch(NullPointerException e) // e hold null pointer excp obj and nullpointerexcp is class
		{
		 e.printStackTrace(); // predefined print for excp stack	
		 System.out.println("Close File");
		 // never keep catch block empty
		 // can print user friendly message too for the user syserr
		}
		catch(Exception e)// parent of all unchecked excp (recomended practice to have extra block )
		{
		 e.printStackTrace();	
		}
		
		finally
		{
		 System.out.println("Exception is handelled");
		}
	}

	public static int div(int a, int b) throws ArithmeticException
	//static can be called directly within the class but use class name for using it in another class
	// throws keyword use to throw excp from callee to caller meth. and it cannot handle excp it just throws exp to caller where excp should be handled
	{
		return a/b;
	}
}
