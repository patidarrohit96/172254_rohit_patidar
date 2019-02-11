package Q3;

import java.lang.Math;
public class Account extends Customer
{
	int aid;
	double balance=0.0;
	public Account( ) 
	{
		super(id, name, gender);
		this.balance=balance;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public int getAid() 
	{
		return aid;
	}
	public void credit(double amount)
	{
		balance = balance+amount;
		System.out.println("After credit:");
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println("After withdraw:");
		}
		else
		{
			System.out.println("amount withdrawn exceeds the current balance!");
		}
	}
	@Override
	public String toString()
	{
		return String.format("%.2f", balance);
	}
	
	
}
