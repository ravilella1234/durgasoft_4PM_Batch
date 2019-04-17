package com.icici.loans.carloans;

public class SecondClass 
{
	int i=100; // instance (or) non-static (or) global variable
	static String name="ravilella"; // static variable
	
	public void m1()
	{
		System.out.println("iam m1 instance method");
	}
	
	public static void m2()
	{
		System.out.println("iam m2 static method");
	}
	
	public static void main(String[] args) 
	{
		SecondClass obj=new SecondClass();	
		System.out.println(obj.i);
		System.out.println(name);
		
		obj.m1();
		m2();
	}

}
