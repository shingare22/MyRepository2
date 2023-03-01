package com.classes;

public class Cars {
	
	
	int cid;
	String cname;
	int cprice;
	String ccolour;
	
	public static void main(String[] args) {
		
		Cars c1=new Cars();
		Cars c2=new Cars();
		Cars c3=new Cars();
		
		c1.cid=201;
		c1.cname="Thar";
	    c1.cprice=6000000;
	    c1.ccolour="Black";
	    
	    c2.cid=202;
		c2.cname="Ev";
	    c2.cprice=900000;
	    c2.ccolour="White";
	    
	    c3.cid=203;
		c3.cname="BMW";
	    c3.cprice=31000000;
	    c3.ccolour="red";
	    
	    
	    System.out.println(c1.cid);
	    System.out.println(c1.cname);
	    System.out.println(c1.cprice);
	    System.out.println(c1.ccolour);	
	    
	    System.out.println();
	    System.out.println(c2.cid);
	    System.out.println(c2.cname);
	    System.out.println(c2.cprice);
	    System.out.println(c2.ccolour);	
	    
	    System.out.println();
	    System.out.println(c3.cid);
	    System.out.println(c3.cname);
	    System.out.println(c3.cprice);
	    System.out.println(c3.ccolour);	
	    
	    
	  }	
   }

