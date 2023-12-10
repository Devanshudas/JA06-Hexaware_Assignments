package com.threads;

public class ThreadDemo implements Runnable 
{
	public static void main(String[] args) 
	{
		ThreadDemo td = new ThreadDemo(); // also Runnable td = new .....;
		
		Thread t1 = new Thread(td); // runnable type object 
		
		t1.start();
		
		t1.setName("Das");
		
		Thread t2 = new Thread(td);
		
		t2.setName("Devanshu");
		
		t2.start();
	}
	
	
	
	@Override
	public void run() 
	{
		for (int i = 0; i<5; i++) 
		{
			System.out.println(Thread.currentThread().getName() + i);
			
		}
		
	}

}
