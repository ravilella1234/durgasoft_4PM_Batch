package com.icici.loans.educationloans;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		List<Object> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(40);
	
		
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(50));
		a.add(1, 100);
		
		for(Object i:a)
		{
			System.out.println(i);
		}

	}

}
