package com.icici.loans.carloans;

public class FirstClass 
{
	
	int a=10,b=20,c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Add of A & B :" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A & B is :" + c);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hi !");
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();

		
		FirstClass obj1=new FirstClass();
		obj1.add();
		obj1.sub();
	}

}
