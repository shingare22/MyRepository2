package com.Assignment_date28;

public class Access {

	private int rollNo=10;
	public String name="Karan";
	int age=23;
	protected int id=101;
	
	
	
	public static void main(String[] args) {
		
		Access a=new Access();
		
		System.out.println(a.rollNo);
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.id);
	}
	
	
}
