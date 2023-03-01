package com.Assignday3;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number:  ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		int r;
		
		while(num>0) {
			
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
		}
			if(temp==sum)
			System.out.println("Its a armstrong number");
			else
				System.out.println("Not Armstrong");
			
		}
	
}