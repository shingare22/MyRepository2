package com.Day1Assignments;
import java.util.Scanner;
//Find Out Number Even or Odd usin Switch
public class Oddevenswitch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int num=sc.nextInt();
		
		switch(num%2) {
		
		case 0:System.out.println(num  +   "  is  Even");
		break;
		case 1:System.out.println(num +"  is  Odd");
		break;
	
	
	}
	}

}
