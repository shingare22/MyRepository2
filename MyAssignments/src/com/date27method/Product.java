package com.date27method;

import java.util.Scanner;

public class Product {
	
	String name;
	int Quantity;
	int price;
	
	
	public void productdetail(String pname, int pquantity , int  pprice)
	{
		 name=pname;
		 Quantity=pquantity;
		 price=pprice;
		 
	}
	public void productdisplay()
	{
		System.out.println(name);
		System.out.println(Quantity);
		System.out.println(price);
	}
	
	
	public static void main(String[] args) {
		
		Product p=new Product();
		
		p. productdetail("phone",1,15000);
		p.productdisplay();
		
	}
}
