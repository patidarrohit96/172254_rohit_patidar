package LambdaAssignment6;

import java.util.ArrayList;

public class UpperMain
{
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("akshay");
		list.add("mahesh");
		list.add("rohit");
		
		
		System.out.println("List before coverting to Uppercase");
		list.forEach(System.out::println);
		System.out.println("--------------------------------------");
		
		list.replaceAll(e->e.toUpperCase());
		
		System.out.println("List after converting to uppercase");
		list.forEach(System.out::println);
		
	}


}
