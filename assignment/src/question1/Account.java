package question1;

public class Account
{
 private String id;
 private String name;
 private int balance=0;
 
 Account(String x,String y)
 {
	id=x;
	name=y;	 
 }
 Account(String a, String b, int c)
 {
	 id=a;
	 name=b;
	 balance=c;	 
 }
 
public String getId()
{''
	return id;
}	

public String getName() 
{
	return name;
}
public int getBalance()
{
	return balance;
}

public int credit(int amount)
{
	balance=balance+amount;
	return balance;
}
public void debit(int amount)
{
if(amount<=balance)
	{balance=balance-amount;
	System.out.println(balance);
	}
else
	System.out.println("amount excedeed balance");
}
public void transfer(Account another, int amount)
{
	if(amount<=balance){
		{balance=balance-amount;}
	System.out.println(balance);
	}
	else
		{System.out.println("amount excedeed balance");}
}
public static void main(String[] args)
{
	Account a = new Account("100","rohit",2000);
	a.credit(7000);
	a.debit(6000);
    a.transfer(a,2000);
	

}

}


 



