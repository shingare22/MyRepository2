package com.classes;

public class Car {
	
	int cid;
	String cname;
	int cprice;
	String ccolour;
	
	public static void main(String[] args) {
		
		Car ref=new Car();
		
		ref.cid=201;
		ref.cname="Thar";
	    ref.cprice=6000000;
	    ref.ccolour="Black";
	    
	    System.out.println(ref.cid);
	    System.out.println(ref.cname);
	    System.out.println(ref.cprice);
	    System.out.println(ref.ccolour);	
	  }	
   }
