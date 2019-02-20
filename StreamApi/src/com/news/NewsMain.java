package com.news;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;




public class NewsMain {
	public static void main(String args[])
	{
		List<News> al=new ArrayList<>();
		al.add(new News(101, "harish", "Budget", "budget"));
		al.add(new News(105, "mahesh", "Superhit", "budget"));
		al.add(new News(102, "Budget", "Budget", "what the hell"));
		al.add(new News(103, "harry", "Superhit", "I'm the one"));
		al.add(new News(101, "harish ", "Budget", "budget"));
		al.add(new News(101, "harish ", "Superhit", "How are u"));
		al.add(new News(104, "harish4", "Good", "budget"));
		List<News> names11=al.stream()
				.filter(p->p.getCommentByUser().contains("Budget"))
				.collect(Collectors.toList());
		long i=names11.stream().count();
		
		System.out.println("Assignment 5 question="+i);
		
		Map<Object, Long> map = al.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));

		

		long maxval=(Collections.max(map.values()));

		for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) {

		if(entry.getValue()==maxval) {

		System.out.println("Assignment 4 question="+entry.getKey());

		}	
		
		}
		Map<Object, Long> map1 = al.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
		long maxval1=(Collections.max(map1.values()));
		for(java.util.Map.Entry<Object, Long> entry1:map1.entrySet()) 
		{

			if(entry1.getValue()==maxval1) 
			{

			System.out.println("Assignment 6 question="+entry1.getKey());
			
			}	
			
	}
		Map<Object, Long> map2 = al.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println("Assignment 7 question="+ map2);
 }
}


