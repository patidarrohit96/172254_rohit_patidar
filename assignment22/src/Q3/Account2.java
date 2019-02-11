package Q3;

public class Account2 {

	public static void main(String[] args) 
	{
		Customer c=new Customer(1,"Rohit",20);
		System.out.println(c);
		Account a=new Account();
		a.setBalance(60000000.0);
		a.credit(200000.00);
		System.out.println(a);
		a.withdraw(500000.00);
		System.out.println(a);

	}

}
