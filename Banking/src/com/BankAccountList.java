package com;

import java.util.TreeSet;

public class BankAccountList {

 TreeSet<SavingAccount> accounts;
 public BankAccountList()
 {
	 accounts=new TreeSet<SavingAccount>();
 }
 public void addaccount(SavingAccount account)
 {
	 accounts.add(account);
	 
 }
 public void removeaccount(SavingAccount account)
 {
	 accounts.remove(account);
	 
 }
 public TreeSet<SavingAccount> getAccounts()
 {
	 return accounts;
 }

}
