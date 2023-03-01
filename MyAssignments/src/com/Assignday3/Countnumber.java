package com.Assignday3;
//Count Digit From number

import java.util.Scanner;

public class Countnumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num=num/10;
			++count;
		}
		System.out.println("digit is "+count);
		}
	}


