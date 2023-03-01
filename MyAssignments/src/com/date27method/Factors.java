package com.date27method;

import java.util.Scanner;

public class Factors {
	

	public void Factor(int n)
	{
	      for(int i=1;i<=n;i++) {
	    	  
	    	  if(n%i==0) {
	    		  
	    		  System.out.print(i+" ");
	    	  }
	      }
	}
	
	public static void main(String[] args) {
			
		Factors f=new Factors();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Number:  ");
		int num=sc.nextInt();
		f.Factor(num);
		
	}
}
