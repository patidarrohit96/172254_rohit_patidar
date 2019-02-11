package Q2;

public class Author2 
{
	public static void main(String[] args)
	{
		Author a=new Author("rohit","patidarrohit96@gmail.com",'M');
		Book b=new Book("me mysterious");
		b.setPrice(450);
		b.setQty(2);
		System.out.println(b);
	}
}