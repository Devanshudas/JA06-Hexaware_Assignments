package com.exception;

public class Main 
{

	public static void main(String[] args) 
	{
	int account[] = {101,102,103,104,105};
	String names[] = {"Devanshu","Rishu","Rhea","Ronnie","Misht"};
	double balance[] = {5000,500,8000,7000,9000};
	
	for (int i = 0; i < balance.length; i++) 
	{
		System.out.println(account[i]+ " "+ names[i]+" "+ balance[i]);
		
		if(balance[i]<1000)
		{
			try 
			{
			throw new LowBalanceException();
			// user defined exception
			}
			catch(LowBalanceException e)
			{
				System.err.println(names[i]+ ": Your Balace is low.");
			}
			
		}
	}
	}

}
