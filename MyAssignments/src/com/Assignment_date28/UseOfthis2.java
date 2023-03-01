package com.Assignment_date28;

public class UseOfthis2 {
	
	public void method1()
	
	{
		
		System.out.println("Method 1.........");
	}
	
	public void method2()
	
	{
		
		this.method1();
		System.out.println("Method 2.....");
	}
	
	public static void main(String[] args) {
		
		UseOfthis2 m=new UseOfthis2();
		
		m.method2();
		
	}

}
