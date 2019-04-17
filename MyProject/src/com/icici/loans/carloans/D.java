package com.icici.loans.carloans;

import com.icici.loans.educationloans.B;
import com.icici.loans.homeloans.C;

public class D extends B
{

	public void m4()
	{
		System.out.println("iam m4 from class D");
	}
	
	public static void main(String[] args)
	{
		C c=new C();
		c.m1();
		c.m3();
		
		D d=new D();
		d.m4();
		d.m2();
		d.m1();

	}

}
