package com.transection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import  com.trader.Trader;

public class TransactionMain {
	public static void main(String args[]) {
		List<Transaction> al=new ArrayList<>();
al.add(new Transaction(new Trader("rohit", "indore"), 2011, 1000));
al.add(new Transaction(new Trader("patidar", "Indore"), 2014, 1000));	
al.add(new Transaction(new Trader("Mahesh", "Pune"), 2015, 1000));
al.add(new Transaction(new Trader("harish", "bhopal"), 2001, 1000));
al.add(new Transaction(new Trader("ankit", "Pune"), 2008, 1060));
al.add(new Transaction(new Trader("abhinay", "mahu"), 2019, 41000));
al.add(new Transaction(new Trader("sai", "Delhi"), 2017, 5000));
List<Transaction> names8=al.stream()
                   .filter(p->p.getTrader().getCity()=="Delhi")
					.collect(Collectors.toList());
            names8.forEach(e->System.out.println("Assignment 13 transaction: "+e.getValue()+" by "+e.getTrader().getName()));

           Transaction max=al.stream()
            		.max((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
            				.get();
             System.out.println("Assignment 14 = "+  max.getValue());
             Transaction min=al.stream()
             		.min((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
             				.get();
              System.out.println("Assignment 15 ="+ min.getValue());
	}

}
