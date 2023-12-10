package com.threads;

public class MyThread extends Thread
{

	public static void main(String[] args) 
	{

		
		MyThread t1 = new MyThread(); // normally get hashcode but in case of thread it will get thread info
		
		t1.setName("ChildThread");
		t1.setPriority(NORM_PRIORITY);
		
		System.out.println(t1);
		
		t1.start();
		
		for (int i = 0; i<5; i++) 
		{
			System.out.println("Main "+ i);
			
		}
	}
	
	@Override
	public void run() 
	{
		for (int i = 0; i<5; i++) 
		{
			System.out.println("Child "+ i);
			
		}
	
	}

}
