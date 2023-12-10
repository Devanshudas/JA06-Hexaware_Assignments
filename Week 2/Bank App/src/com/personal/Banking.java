package com.personal;
import java.util.*;

public class Banking
{
    int accn;
    int amount;
    String name;

    void insert(int i,String n)
    {
        accn= i;
        name=n;
    }
    void deposit(int amt)
    {
        System.out.println(amt + " is deposited");
        System.out.println("Transaction Successfull.");
    }
    void withdraw(int amt2)
    {
    	System.out.println(amt2 + " is Withdrawed");
        System.out.println("Transaction Successfull.");
    }
    int welcome(String cname)
    {
        System.out.println("Hello " + cname + "!");
        System.out.println("Please enter Your Selection");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Welcome to Swiss Bank");
    	System.out.println("Please Enter your Account No.");
    	int acc = sc.nextInt();
    	System.out.println("Please Enter your Full Name.");
    	String cname = sc.nextLine();
    	
        Banking d = new Banking();
        d.insert(acc,cname);
        if(d.welcome(cname)==1)
        {
        	System.out.println("Enter the Amount: ");
        	d.deposit(sc.nextInt());
        }
        if(d.welcome(cname)==2)
        {
        	System.out.println("Enter the Amount: ");
        	d.withdraw(sc.nextInt());
        }


    }
}
