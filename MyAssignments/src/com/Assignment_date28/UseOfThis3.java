package com.Assignment_date28;

public class UseOfThis3 {
	
	
	public UseOfThis3() {
		
		System.out.println("This is Defualt Constructor.....");
	}
	public UseOfThis3(int num) {
		
		this();
		System.out.println("Number is: "+num);
	}
	

	
	public static void main(String[] args){
		
		
		UseOfThis3 t= new UseOfThis3(4);
		
	
		
	}

}
