package com.threads;

public class Admission implements Runnable
{
	int seats = 1;

	public static void main(String[] args) 
	{
		Admission ad = new Admission();
		Thread t1 = new Thread(ad);
		t1.setName("Devanshu");
		
		Thread t2 = new Thread(ad,"Sanskar");
		t1.start();
		t2.start();
		

	}
	@Override
	public synchronized void run() // sync for thread to execute one after another not at same time
	{
		System.out.println("No seats before: " +seats);
		
		if(seats > 0)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ " you allocated seat");
			seats = seats-1;
		}
		else
		{
			System.err.println(Thread.currentThread().getName()+" Sorry try again next year");
		}
		System.out.println("No seats after: " + seats);
		
	}

}
