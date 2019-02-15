package com;

public class SavingAccount implements Comparable<SavingAccount> {

	private double acc_balance;
	private int acc_ID; 
	private String accountHoldername;
	private boolean isSalaryAccount;
	
	
	public SavingAccount(double acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public double withdraw(double amount)
	{
		if(amount<acc_balance)
		{
			amount=amount-acc_balance;
		}
		else
		{
			System.out.println("amount exceeded balance");
		}
		return acc_balance;
	}
	public double deposit(double amount)
	{
		acc_balance=amount+acc_balance;
		return acc_balance;
	}
	

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	@Override
	public int compareTo(SavingAccount arg0) {
		if(acc_ID>arg0.getAcc_ID())
		return 1;
		if(acc_ID<arg0.getAcc_ID())
		return -1;
		return 0;
	}

}


