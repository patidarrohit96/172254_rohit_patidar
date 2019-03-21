package com.spring.aop.model;

public class Circle {
	
    private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	//	System.out.println("setter of circle is call");
    //    throw(new RuntimeException());
	}
	public String setNameandReturn(String name) {
		this.name = name;
		System.out.println("setter of circle is call");
		return name;

	}
}
