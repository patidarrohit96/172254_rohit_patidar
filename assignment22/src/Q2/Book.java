package Q2;

public class Book extends Author
{
	String bname;
	double price;
	int qty=0;
	public Book(String bname) 
	{
		super(name, email, gender);
		this.bname=bname;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQty() 
	{
		return qty;
	}
	public void setQty(int qty) 
	{
		this.qty = qty;
	}
	public String getBname() 
	{
		return bname;
	}
	@Override
	public String toString()
	{
		return "Book[name= " + bname + ",Author [name= " + name + ",email= " + email + ",Gender= " + gender + 
				"] , price= " +price + ",qty= " + qty + "]";
	}
	
	
}
