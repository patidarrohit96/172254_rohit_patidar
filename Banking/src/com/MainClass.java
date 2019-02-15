package com;

import java.util.Iterator;
import java.util.TreeSet;

public class MainClass {
	public static void main(String[] args) {
		BankAccountList b = new BankAccountList();

		SavingAccount a1 = new SavingAccount(10000, 111, "Rohit", true);
		SavingAccount a2 = new SavingAccount(1000, 333, "pawan", true);
		SavingAccount a3 = new SavingAccount(15000, 222, "abhinay", true);
		SavingAccount a4 = new SavingAccount(17000, 444, "ankit", true);
		SavingAccount a5 = new SavingAccount(19000, 555, "akshay", true);
		SavingAccount a6 = new SavingAccount(17000, 444, "osmkar", true);
		//a1.deposit(5000);
		//a2.withdraw(10000);
		b.addaccount(a1);
		b.addaccount(a2);
		b.addaccount(a3);
		b.addaccount(a4);
		b.addaccount(a5);
		b.addaccount(a6);
		TreeSet<SavingAccount> account = b.getAccounts();
		Iterator<SavingAccount> it = account.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}