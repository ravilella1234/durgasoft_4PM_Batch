package com.icici.loans.educationloans;

class Parent1
{
	
	Number workhard()
	{
		System.out.println("wakeup early,gotocollege");
		return 10;
	}
	
	float care()
	{
		System.out.println("utmost care");
		return 10.5f;
	}
}
class Child1 extends Parent1
{
	strictfp  Object workhard()
	{
		System.out.println("wakeup anytime,goto bar");
		return 20;
	}
	void love()
	{
		System.out.println("im in love");
	}
}

public class Test3 
{

	public static void main(String[] args) 
	{
		
		Parent1 p1=new Parent1();
		p1.workhard();
		p1.care();
		
		
		Child1 c1=new Child1();
		c1.workhard();
		c1.care();
		c1.love();
		
		Parent1 p2=new Child1();
		p2.workhard();
		p2.care();
	
	}

}

