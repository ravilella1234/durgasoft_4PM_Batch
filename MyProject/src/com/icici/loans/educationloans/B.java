package com.icici.loans.educationloans;

public class B extends A
{
	 public void m1()
		{
			System.out.println("iam overriden m1 from class B");
		}

	public void m2()
	{
		System.out.println("iam m2 from class B");
	}

	public static void main(String[] args) 
	{
		A obj1=new A();
		obj1.m1();
		
		B obj2=new B();
		obj2.m1();
		obj2.m2();
		
		A obj4=new B ();
		obj4.m1();
		
		A obj3=(A)obj2;
		obj3.m1();
		
		
		float f;
		int i=10;
		f=i;
		System.out.println(f);
		

		
	}

	

}
