package com.Assignment_date28;

public class UseOfThis {

	int id;
	String name;
	
	public void show(int id, String name)
	{
		
		this.id=id;
		this.name=name;
	}
	 
	
	public void display() {
		
		System.out.println(id);
		System.out.println(name);
	}
	
	public UseOfThis() {
		
		this(6);
		System.out.println("This is default constructor...");
	}
	
	public UseOfThis(int n) {
		
		
		
		System.out.println("Number is : "+n);
	}
	
	public static void main(String[] args) {
	
		UseOfThis ref=new UseOfThis();
		//UseOfThis ref2=new UseOfThis(5);
		
		ref.show(10, "Amit");
		ref.display();
		
		
	}
	
}
