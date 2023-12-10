package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

@Service
public class BankService 
{
	public void fundTransfer()
	{
		System.out.println("Transaction successfull");
	}
	public void withdraw()
	{
		System.out.println("Withdrawal successfull");
	}
	public void deposit()
	{
		System.out.println("Deposit successfull");
	}
}
