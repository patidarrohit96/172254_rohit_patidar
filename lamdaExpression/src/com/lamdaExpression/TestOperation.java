package com.lamdaExpression;

public class TestOperation {
	public static void main(String[] args) {

		Operations addition=(a,b) -> (a+b);

		System.out.println("Addition is "+addition.operation(5, 6));

		Operations subtraction=(a,b) -> (a-b);

		System.out.println("Subtraction is "+subtraction.operation(10, 5));

		Operations multiplication=(a,b) -> (a*b);

		System.out.println("Multiplication is "+multiplication.operation(5, 6));

		Operations division=(a,b) -> (a/b);

		System.out.println("Division is "+division.operation(10, 5));
		}

		
}


