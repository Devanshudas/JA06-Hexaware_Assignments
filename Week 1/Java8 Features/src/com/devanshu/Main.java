package com.devanshu;

public class Main 
{
	public static void main(String[] args) 
	{
		FuncInterface m1 =(int a, int b)->
		{
		return a+b;	
		}; //lambda expression
		
		int res = m1.add(2, 4);
		System.out.println("Result: "+ res);
	}

}
 